package br.com.claucio.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class UserController {
    

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }
}
