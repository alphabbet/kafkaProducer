package com.springboot.kafka;

import com.springboot.kafka.Producer.Producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KafkaApplication.class, args);
        Producer producer = context.getBean(Producer.class);
        //Solver solver = context.getBean(Solver.class);
        //solver.solve();
        //SpringApplication.run(KafkaApplication.class, args);

    }


}
