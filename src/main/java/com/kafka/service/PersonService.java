package com.kafka.service;

import com.kafka.dto.CreatePersonDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class PersonService {
    private final KafkaTemplate<String, CreatePersonDTO> kafkaTemplate;

    public void createPerson(CreatePersonDTO person) {
        kafkaTemplate.send("per", person);
    }

}
