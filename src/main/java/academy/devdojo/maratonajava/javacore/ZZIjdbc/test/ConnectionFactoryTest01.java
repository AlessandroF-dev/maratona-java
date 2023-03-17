package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        ProducerService.showDriverMetaData();

//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);

//        List<Producer> producers = ProducerService.findAll();
//        Producer producer = Producer.builder().name("MadHouse").build();
//        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.update(producerToUpdate);

//        ProducerService.delete(4);

//        ProducerService.save(producer);

//       log.warn("warn");
//       log.debug("debug");
//       log.info("INFO");
//       log.error("error");
//       log.trace("trace");
    }
}
