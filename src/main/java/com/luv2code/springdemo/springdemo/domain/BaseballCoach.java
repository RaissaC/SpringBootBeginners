package com.luv2code.springdemo.springdemo.domain;

public class BaseballCoach implements Coach{

  @Override
  public String getDailyWorkut() {
    return "Spend 30 minutes on batting practice";
  }
}
