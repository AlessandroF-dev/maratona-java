package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();

        ProducerService.update(producerToUpdate);

//        ProducerService.delete(5);

//        ProducerService.save(producer);
//       log.info("INFO");
//       log.debug("debug");
//       log.warn("warn");
//       log.error("error");
//       log.trace("trace");
    }
}
