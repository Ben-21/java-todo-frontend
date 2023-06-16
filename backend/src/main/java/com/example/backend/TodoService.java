package com.example.backend;


import lombok.Data;
import org.springframework.stereotype.Service;


import java.util.List;




@Service
@Data
public class TodoService {

    private final TodoRepo todoRepo;



    public List<Todo> getAllTodos(){
        return todoRepo.getAllTodos();
    }

    public  void createTodo(String title, String description){
        todoRepo.createTodo(title, description);
    }


    public Todo getTodoById(String id){
        return todoRepo.getTodoById(id);
    }

    public void updateTodoById (String id, Todo todo){
        todoRepo.updateTodoById(id, todo);
        }


    public void deleteTodoById(String id){
        todoRepo.deleteTodoById(id);
    }
}
