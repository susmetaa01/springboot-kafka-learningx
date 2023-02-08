package com.example.springbootkafkalearning2.kafka;


import com.example.springbootkafkalearning2.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
//${spring.kafka.topic-json.name}
    //${spring.kafka.consumer.group-id}
    @KafkaListener(topics = "topic2", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json message recieved -> %s", user.toString()));
    }

}
