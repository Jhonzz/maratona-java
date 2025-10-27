package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Log4j2
public class ProducerRepository {

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding producer by id " + id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreaparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next())  return Optional.empty();
            return Optional.of(
                    Producer.builder().
                    id(rs.getInt("id")).
                    name(rs.getString("name")).
                    build());

            }
        catch (SQLException e) {
            log.error("Error while trying to find producers", e);
        }
        return Optional.empty();
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding producer by name '{}' ", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreaparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()){
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        }
        catch (SQLException e) {
            log.error("Error while trying to find producers", e);
        }
        return producers;
    }


    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = createPreaparedStatementDelete(conn, id);
            ps.execute();
            log.info("Deleted producer '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }
    public static void save(Producer producer) {
        log.info("Saving producer '{}'",(producer.getName()));

        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = createPreparedStatementSave(conn, producer);
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to save producer");
        }
    }

    public static void update(Producer producer){
        log.info("Updating producer '{}'", producer);
        try(Connection conn = ConnectionFactory.getConnection()){
            PreparedStatement ps = createPreparedStatementUpdate(conn, producer);
            ps.execute();
            log.info("Updated producer '{}'",producer.getId());
        } catch (SQLException e) {
            log.error("Error while updating producer");
        }
    }


    public static PreparedStatement createPreparedStatementSave(Connection conn, Producer producer) throws SQLException{
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }
    private static PreparedStatement createPreaparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM anime_store.producer WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    private static PreparedStatement createPreaparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }
    private static PreparedStatement createPreaparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE anime_store.producer SET name=? WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
