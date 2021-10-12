package com.techbuddy.apachekafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageConsumerController {

    List<String> messages = new ArrayList<>();

    Book bookFromTopic = null;

    @GetMapping("/consumeStringMessage")
    public List<String> consumeMessage(){
        return messages;
    }

    @GetMapping("/consumeJsonMessage")
    public Book consumeJsonMessage(){
        return bookFromTopic;
    }

    @KafkaListener(groupId = "techBuddy-1", topics = "TestTopic", containerFactory = "kafkaListenerContainerFactory")
    public List<String> getMessageFromTopic(String data){
        messages.add(data);
        return messages;
    }

    @KafkaListener(groupId = "techBuddy-2", topics = "TestTopic", containerFactory = "bookKafkaListenerContainerFactory")
    public Book getJsonMessageFromTopic(Book book){
        bookFromTopic = book;
        return book;
    }
}
