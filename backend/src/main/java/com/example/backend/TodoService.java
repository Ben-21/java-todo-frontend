package com.example.backend;


import lombok.Data;


import java.util.List;


@org.springframework.stereotype.Service

@Data
public class TodoService {

    private final TodoRepo todoRepo;



    public List<Todo> getAllTodos(){
        return todoRepo.getAllTodos();
    }
}
