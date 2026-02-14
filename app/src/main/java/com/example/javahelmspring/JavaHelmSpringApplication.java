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
   System.out.println("SpringBoot request received");
   return "Starting Feb 14 Updates fourth JavaHelmSpring running on rend EKS";
 }
}