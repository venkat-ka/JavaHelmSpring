package com.example.javahelmspring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class JavaHelmSpringApplication {
 public static void main(String[] args){
   SpringApplication.run(JavaHelmSpringApplication.class,args);
 }
 @GetMapping("/")
 public String home(){
   return "Updated third JavaHelmSpring running on EKS";
 }
}