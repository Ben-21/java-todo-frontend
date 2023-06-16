package com.example.backend;


import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@Data
public class TodoController {


    private final TodoService todoService;



    @GetMapping
    public List<Todo> todos (){
        return todoService.getAllTodos();
    }


    @PostMapping
    public List<Todo> createTodo(@RequestBody Todo todo){




        return todoService.getAllTodos();
    }



}
