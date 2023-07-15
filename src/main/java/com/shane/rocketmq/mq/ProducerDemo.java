package com.shane.rocketmq.mq;

import com.shane.rocketmq.config.JmsConfig;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerDemo {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping(value = "/message/send/{id}")
    public String send(@PathVariable("id") String id){
        rocketMQTemplate.convertAndSend(JmsConfig.TOPIC, id);
        return "Send Successfully";
    }

}
