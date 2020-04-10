package com.springboot.kafka.Producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nju")
public class InstanceController {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public void test(){
        Solver solver = new Solver();
        solver.solve();
    }

}
