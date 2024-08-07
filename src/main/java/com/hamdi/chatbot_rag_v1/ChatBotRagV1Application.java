package com.hamdi.chatbot_rag_v1;

import com.hamdi.chatbot_rag_v1.entities.Person;
import com.hamdi.chatbot_rag_v1.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class ChatBotRagV1Application {

    public static void main(String[] args) {
        SpringApplication.run(ChatBotRagV1Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository){
        return args -> {
            for(int i=0;i<100; i++){
                Person person = Person.builder()
                        .nom(UUID.randomUUID().toString().substring(0,8))
                        .email(UUID.randomUUID().toString().substring(0,8)+"@gmail.com")
                        .build();
                personRepository.save(person);

            }
        };

    }

}
