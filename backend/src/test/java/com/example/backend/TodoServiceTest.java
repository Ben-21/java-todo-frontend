package com.example.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Todo todo2 = new Todo("2", "OPEN", "Do the floor cleaning");
        List<Todo> expectedList = new ArrayList<>(List.of(todo1, todo2));

        //WHEN
        when(todoRepo.getAllTodos()).thenReturn(expectedList);
        List<Todo> actualList = todoService.getAllTodos();

        //THEN
        Assertions.assertEquals(expectedList, actualList);
        verify(todoRepo).getAllTodos();
    }


    @Test
    void returnTodoWithId_whenAddTodo() {

        //GIVEN
        Todo todo1 = new Todo("", "OPEN", "Do the dishes");
        Todo expected = new Todo("100", "OPEN", "Do the dishes");

        //WHEN
        when(randomGenerators.getRandomId()).thenReturn("100");
        when(todoRepo.addTodo(todo1)).thenReturn(todo1);

        Todo actualTodo = todoService.addTodo(todo1);

        //THEN
        Assertions.assertEquals(expected, actualTodo);
        verify(todoRepo).addTodo(todo1);
        verify(randomGenerators).getRandomId();
    }


    @Test
    void returnTodoById() {
        //GIVEN
        String id = "1234";
        Todo todoTest = new Todo("1234", "open", "description");

        //WHEN
        when(todoRepo.getTodoById(id)).thenReturn(todoTest);
        Todo actual = todoService.getTodoById(id);


        //THEN
        Assertions.assertEquals(todoTest, actual);
        verify(todoRepo).getTodoById(id);
    }


    @Test
    void updateTodoById() {
        //GIVEN
        Todo todoToUpdate = new Todo("1", "closed", "Ich bin das Todo zum ändern");


        //WHEN
        todoService.updateTodoById("1", todoToUpdate);


        //THEN
        verify(todoRepo).updateTodoById("1", todoToUpdate);
    }


    @Test
    void returnNull_whenDeleteTodoById (){
        //GIVEN



        //WHEN
        todoService.deleteTodoById("1234");


        //THEN
        verify(todoRepo).deleteTodoById("1234");
    }


}
