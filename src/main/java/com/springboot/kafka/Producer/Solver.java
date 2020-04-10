package com.springboot.kafka.Producer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Solver {
    Producer producer;

    public void solve(){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0;i<4;i++){
            temp.add(i);
            producer.send(temp.get(i).toString());
        }
    }

}
