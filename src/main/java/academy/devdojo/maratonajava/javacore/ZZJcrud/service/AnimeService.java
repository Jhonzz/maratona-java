package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(Integer op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        AnimeRepository.findByName(name)
                .forEach(anime -> System.out.printf("[%d] - %s %d %s%n ",
                        anime.getId(), anime.getName(), anime.getEpisodes(), anime.getProducer()));
    }
    private static void findById() {
        int id = SCANNER.nextInt();
        AnimeRepository.findById(id);
    }

    private static void delete() {
        System.out.println("Type the id you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }
    private static void save(){
        System.out.println("Type the name of the Anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes");
        int episodes = SCANNER.nextInt();
        System.out.println("Type the id of the producer");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime
                .builder()
                .episodes(episodes)
                .name(name)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    private static void update(){
        System.out.println("Type the id of the anime you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()){
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the number of episodes or enter to keep the same");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Anime animeToUpdate = Anime
                .builder()
                .id(animeFromDb.getId())
                .episodes(episodes)
                .producer(animeFromDb.getProducer())
                .name(name)
                .build();
        AnimeRepository.update(animeToUpdate);
    }
}
