package com.springboot.kafka.Producer;

public interface ProducerController {

    void send(String s);

    int get_iteration_tenure();

    int get_time_tenure();

}
