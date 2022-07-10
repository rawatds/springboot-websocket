package com.websocket.websocketdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    WebSockets in a Spring Boot Application
    /app/input - Message Mapping URL
    /topic/output - Message Broker topic for pushing messages to the UI back.
*/


@SpringBootApplication
public class WebsocketApplication implements ApplicationRunner {

//    @Autowired
//    SchedulerConfig schedulerConfig;
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(WebsocketApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //schedulerConfig.sendRandomMessages();
    }
}
