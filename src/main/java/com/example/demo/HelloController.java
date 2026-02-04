package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

 @GetMapping("/count")
 public int count(){
  return 1;
 }
}