package com.websocket.websocketdemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller
public class MessageController {

   /* @MessageMapping("/news")
    @SendTo("/topic/news")
    public String broadcastNews(@Payload String message) {


        return message;
    }
*/
/*
    WebSockets in a Spring Boot Application
    /app/input - Message Mapping URL
    /topic/output - Message Broker topic for pushing messages to the UI back.
*/


    @MessageMapping("/input")    // /app added implicitly
    @SendTo("/topic/output")
    public String getUser() {
        System.out.println("** called at " +  LocalDateTime.now().toString());
        return "*" + LocalDateTime.now().toString();
    }
}
