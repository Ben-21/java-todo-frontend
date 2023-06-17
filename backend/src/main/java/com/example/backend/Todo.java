package com.example.backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;


public class Todo {
//        private RandomGenerators randomGenerators;
    private String id;
    private String status;
    private String description;

    public Todo(String id, String status, String description) {
        this.id = id;
        this.status = status;
        this.description = description;
    }

//    public Todo(String status, String description) {
//        randomGenerators = new RandomGenerators();
//        this.id = randomGenerators.getRandomId();
//        this.status = status;
//        this.description = description;
//    }


    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Todo{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) && Objects.equals(status, todo.status) && Objects.equals(description, todo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, description);
    }
}
