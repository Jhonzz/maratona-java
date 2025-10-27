package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Log4j2
public class AnimeRepository {

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding anime by id " + id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreaparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();

            Producer producer = Producer
                    .builder()
                    .id(rs.getInt("producer_id"))
                    .name(rs.getString("producer_name"))
                    .build();

            Anime anime = Anime
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
            return Optional.of(anime);

        } catch (SQLException e) {
            log.error("Error while trying to find animes", e);
        }
        return Optional.empty();
    }

    public static List<Anime> findByName(String name) {
        log.info("Finding Anime by name '{}' ", name);
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreaparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {


            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("producer_id"))
                        .name(rs.getString("producer_name"))
                        .build();

                Anime anime = Anime
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find animes", e);
        }
        return animes;
    }


    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = createPreaparedStatementDelete(conn, id);
            ps.execute();
            log.info("Deleted Anime '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete Anime '{}'", id, e);
        }
    }

    public static void save(Anime Anime) {
        log.info("Saving Anime '{}'", (Anime.getName()));

        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = createPreparedStatementSave(conn, Anime);
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to save Anime");
        }
    }

    public static void update(Anime anime) {
        log.info("Updating Anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = createPreparedStatementUpdate(conn, anime);
            ps.execute();
            log.info("Updated Anime '{}', rows affected", anime.getId());
        } catch (SQLException e) {
            log.error("Error while updating Anime");
        }
    }


    public static PreparedStatement createPreparedStatementSave(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO anime_store.anime (id, name, episodes, producer_id) VALUES(?, ?, ?, ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }

    private static PreparedStatement createPreaparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM anime_store.Anime WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPreaparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                select a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name'
                from anime_store.anime a inner join anime_store.producer p on a.producer_id = p.id
                where a.producer_id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPreaparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                select a.id, a.name, a.episodes, a.producer_id, p.name as 'producer_name'
                from anime_store.anime a inner join anime_store.producer p on a.producer_id = p.id
                where a.name like ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = """
                     UPDATE anime_store.anime SET name = ?, episodes = ?
                     WHERE id= ?""";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
