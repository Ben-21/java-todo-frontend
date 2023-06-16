package com.example.backend;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
//@RequiredArgsConstructor
//@Data
public class Repo {

    private final List<Todo> todos = new ArrayList<>();

   






    public List<Todo> getAllTodos(){
        return todos;
    }


}
