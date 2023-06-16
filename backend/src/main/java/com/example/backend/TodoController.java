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
    public List<Todo> getAllTodos (){
        return todoService.getAllTodos();
    }


    @PostMapping
    public void createTodo(@RequestBody Todo todo){
        todoService.createTodo(todo.getStatus(), todo.getDescription());
    }

    @GetMapping("{id}")
    public Todo getTodo (@PathVariable String id){
        return todoService.getTodoById(id);
    }



  @PutMapping("{id}")
    public void updateTodo (@PathVariable String id, @RequestBody Todo todo){
        todoService.updateTodoById(id, todo);
    }


    @DeleteMapping("{id}")
    public void deleteTodo (@PathVariable String id){
        todoService.deleteTodoById(id);


    }



}
