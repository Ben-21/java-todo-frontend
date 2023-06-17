package com.example.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomGeneratorsTest {



    @Test
    void returnId_when_instantiating_Todo() {
        //GIVEN
        //WHEN
        Todo todo = new Todo("1", "OPEN", "Do the dishes");
        String idExpected = todo.getId();

        //THEN
        Assertions.assertEquals(idExpected, todo.getId());
        Assertions.assertNotNull(todo.getId());
    }
}
