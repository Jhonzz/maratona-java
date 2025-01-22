package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Mappa").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSEATUALIZADO").build();
//        ProducerRepository.save(producer);
//        ProducerService.delete(4);
//        ProducerService.delete(5);
//        ProducerService.delete(6);
//        ProducerService.update(producerToUpdate);
        List<Producer> producers = ProducerService.findALl();
//        List<Producer> mad = ProducerService.findByName("mad");
        log.info("Producers found '{}'", producers);


    }
}
