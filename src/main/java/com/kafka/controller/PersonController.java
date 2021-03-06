package com.kafka.controller;

import com.kafka.dto.CreatePersonDTO;
import com.kafka.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping("/person")
    public ResponseEntity<Void> createPerson(@RequestBody CreatePersonDTO body) {
        log.info("request");
        personService.createPerson(body);
        return ResponseEntity.ok().build();
    }
}
