package com.example.backend;


import lombok.Data;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
@Data
public class  TodoRepo {

    private final List<Todo> todos;


    public TodoRepo() {
        this.todos = new ArrayList<>();
        todos.add(new Todo("1", "title1", "description1"));
        todos.add(new Todo("2", "title2", "description2"));
        todos.add(new Todo("2", "title3", "description3"));
    }

    public List<Todo> getAllTodos(){

        return todos;
    }


}

