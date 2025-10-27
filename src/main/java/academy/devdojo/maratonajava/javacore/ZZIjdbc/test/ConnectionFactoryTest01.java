package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("ANNIE PRESENTS").build();
        Producer producerToUpdate = Producer.builder().id(16).name("MADHOUSEATUALIZADO").build();
//       ProducerService.save(producer);
//        ProducerService.delete(4);
//        ProducerService.delete(5);
//        ProducerService.delete(6);
        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findALl();
//        List<Producer> mad = ProducerService.findByName("mad");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showProducerMetadata();
//        ProducerService.showDriverMetadata();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUppercase("gi");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pics");
//        log.info("Producers found '{}'", producers);
//        ProducerService.findBynameAndDelete("A-1 pics");
//        List<Producer> producers = ProducerService.findBynamePreparedStatement("MAPPA");
        log.info("Producers found '{}'", producerToUpdate);


    }
}
