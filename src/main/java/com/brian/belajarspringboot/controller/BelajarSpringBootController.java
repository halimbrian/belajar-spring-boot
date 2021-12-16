package com.brian.belajarspringboot.controller;

import com.brian.belajarspringboot.dao.Greeting;
import com.brian.belajarspringboot.dto.HelloWorldRequest;
import com.brian.belajarspringboot.handler.RestResponseTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Brian.kristianto
 * @created 15/12/2021 - 9:52 PM
 **/
@RestController
public class BelajarSpringBootController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public ResponseEntity<RestResponseTemplate> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        RestResponseTemplate response = new RestResponseTemplate(Boolean.TRUE,"Hello "+name,"success");
        return new ResponseEntity<RestResponseTemplate>(response,HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<RestResponseTemplate> postMapping(@RequestBody String name){
        return new ResponseEntity<RestResponseTemplate>(new RestResponseTemplate(Boolean.TRUE,"hi "+name,"success"),HttpStatus.OK);
    }

    @PostMapping("/postObject")
    public ResponseEntity<RestResponseTemplate> postObject(@RequestBody HelloWorldRequest name){
        return new ResponseEntity<RestResponseTemplate>(new RestResponseTemplate(Boolean.TRUE,"hi "+name.getName(),"success"),HttpStatus.OK);
    }
}
