package com.springboot.kafka.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class SendController {
    @Autowired
    private Producer producer;
    @Autowired
    KafkaTemplate kafkaTemplate;
    @RequestMapping(value = "/send")
    public String send() {

        return "{\"code\":0}";
    }
}
