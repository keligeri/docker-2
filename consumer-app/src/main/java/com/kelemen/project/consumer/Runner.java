package com.kelemen.project.consumer;

import com.kelemen.project.consumer.domain.ClientMessage;
import com.kelemen.project.consumer.repository.ClientMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;

import java.util.Date;

@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final ClientMessageRepository messageRepository;

    @Override
    public void run(String... args) throws Exception {
//        ClientMessa/**/ge clientMessage = new ClientMessage(1, new Date().getTime(), "HelloWorld");
        ClientMessage clientMessage = new ClientMessage();
        clientMessage.setId(1);
        clientMessage.setTimeStamp(new Date().getTime());
        clientMessage.setMessage("HelloWorld");
        messageRepository.save(clientMessage);

        messageRepository.findAll().forEach(System.out::println);
    }

}
