package com.example.mulitds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MulitDsApplication {

  public static void main(String[] args) {
    try {
      SpringApplication.run(MulitDsApplication.class, args);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
