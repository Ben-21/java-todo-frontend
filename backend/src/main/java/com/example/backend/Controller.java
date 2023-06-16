package com.example.backend;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@Data
public class Controller {


    private final Service service;



    @GetMapping
    public List<Todo> todos (){
        return service.getAllTodos();
    }



}
