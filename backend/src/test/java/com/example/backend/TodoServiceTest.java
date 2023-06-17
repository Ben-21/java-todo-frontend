package com.example.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class TodoServiceTest {


   TodoRepo todoRepo = mock(TodoRepo.class);
   RandomGenerators randomGenerators = mock(RandomGenerators.class);
   TodoService todoService = new TodoService(todoRepo, randomGenerators);


    @Test
    void returnAllTodos() {
        //GIVEN
        Todo todo1 = new Todo("1", "OPEN", "Do the dishes");
        Todo todo2 = new Todo("2","OPEN", "Do the floor cleaning");
        List<Todo> expectedList = new ArrayList<>(List.of(todo1, todo2));

        //WHEN
        when(todoRepo.getAllTodos()).thenReturn(expectedList);
        List<Todo> actualList = todoService.getAllTodos();

        //THEN
        Assertions.assertEquals(expectedList, actualList);
        verify(todoRepo).getAllTodos();
    }





}
