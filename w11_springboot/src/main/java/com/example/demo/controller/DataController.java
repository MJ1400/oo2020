package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

import com.example.demo.repository.DataRepository;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class DataController {
    @GetMapping("/api/get/{id}")
    public @ResponseBody ResponseEntity<String> getById(@PathVariable int id) {
        return new ResponseEntity<String>("GET response: " + id, HttpStatus.valueOf(418));
    }

    @GetMapping(value = "/api/json", produces = MediaType.APPLICATION_JSON_VALUE )
    public @ResponseBody Map<String, String> getJson() {
        return DataRepository.buildData();
    }
}