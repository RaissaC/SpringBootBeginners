package com.luv2code.springdemo.springdemo;

import com.luv2code.springdemo.springdemo.domain.BaseballCoach;
import com.luv2code.springdemo.springdemo.domain.Coach;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {

  public static void main(String[] args) {

    //criando objeto
    Coach theCoaash = new TrackCoach();

    //usando o objeto pra printar
    System.out.println(theCoaash.getDailyWorkut());
  }
}