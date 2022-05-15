package com.luv2code.springdemo.springdemo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("endpoint")
public class CoachController {

  @GetMapping
  public ResponseEntity<String> get(){
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
