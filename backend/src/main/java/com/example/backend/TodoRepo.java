package com.example.backend;


import lombok.Data;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
@Data
public class  TodoRepo {

    private final List<Todo> todos;


//    public TodoRepo() {
//        this.todos = new ArrayList<>();
//        todos.add(new Todo("OPEN", "description1"));
//        todos.add(new Todo("OPEN", "description2"));
//        todos.add(new Todo("OPEN", "description3"));
//    }

    public List<Todo> getAllTodos(){

        return todos;
    }

    public Todo createTodo(Todo newTodo){
        todos.add(newTodo);
        return newTodo;
    }

    public Todo getTodoById(String id){
        for (Todo todo : todos){
            if (todo.getId().equals(id)){
                return todo;
            }
        }
        return null;
    }


    public void updateTodoById(String id, Todo todo){
    for (Todo everyTodo : this.todos){
                if (everyTodo.getId().equals(id)){
                    everyTodo.setStatus(todo.getStatus());
                    everyTodo.setDescription(todo.getDescription());
                }
            }
    }


    public void deleteTodoById(String id){
        List<Todo> todoToDelete = new ArrayList<>();
        for (Todo todo : this.todos){
            if (todo.getId().equals(id)){
                todoToDelete.add(todo);
            }
        }
        this.todos.removeAll(todoToDelete);

    }


}

