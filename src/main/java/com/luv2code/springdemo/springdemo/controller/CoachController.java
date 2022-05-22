package com.luv2code.springdemo.springdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("endpoint")
@RequestMapping("/api/teste")
public class CoachController {

  @GetMapping("{/hello}")
  public ResponseEntity<String> get(){
    return ResponseEntity.ok("Hello World");
  }

}
