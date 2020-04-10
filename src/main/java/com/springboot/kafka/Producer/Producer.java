package com.springboot.kafka.Producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@EnableKafka
@Slf4j
public class Producer {
    @Autowired
    private KafkaTemplate<String ,String > kafkaTemplate ;

    private static Gson gson = new GsonBuilder().create();


    //发送消息方法
    public void send(String s) {
        Message message = new Message();
        message.setId("KFK_"+System.currentTimeMillis());
       // message.setMsg(UUID.randomUUID().toString());
        message.setMsg(s.toString());
        message.setSendTime(new Date());
        log.info("+++++++++++++++++++++  message = {}", gson.toJson(message));
        kafkaTemplate.send("test", gson.toJson(message));
    }

}


