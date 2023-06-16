package com.example.backend;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;


@org.springframework.stereotype.Service

@Data
public class Service {


    private final Repo repo;



    public List<Todo> getAllTodos(){
        return repo.getAllTodos();
    }
}
