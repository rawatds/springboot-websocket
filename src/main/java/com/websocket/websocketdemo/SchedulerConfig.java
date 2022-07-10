package com.websocket.websocketdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.util.Random;

@EnableScheduling
@Configuration
public class SchedulerConfig {

    @Autowired
    SimpMessagingTemplate template ;

    @Scheduled(fixedDelay = 1000)  //OK
    public void sendAdhocMessages() {
        template.convertAndSend("/topic/output", LocalDateTime.now());
    }

//    public void sendRandomMessages() throws InterruptedException {
//        while (true) {
//            int delay = (int) (new Random().nextDouble() * 1000);
//            Thread.sleep(delay);
//            template.convertAndSend("/topic/output", LocalDateTime.now());
//        }
//    }
}