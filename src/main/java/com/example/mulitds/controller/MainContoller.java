package com.example.mulitds.controller;

import com.example.mulitds.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainContoller {

  private final MainService mainService;

  @GetMapping("/")
  public ResponseEntity<String> callMain() {
    mainService.getQuery();
    return ResponseEntity.ok("good");
  }
}
