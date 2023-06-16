package com.example.backend;

import java.util.Objects;
import java.util.UUID;

public class Todo {

    private String id;
    private String status;
    private String description;


    public Todo(String status, String description) {
        this.id = UUID.randomUUID().toString().substring(0, 4);
        this.status = status;
        this.description = description;
    }


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
