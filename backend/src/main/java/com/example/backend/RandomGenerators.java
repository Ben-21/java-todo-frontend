package com.example.backend;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class RandomGenerators {


    public String getRandomId(){
        return UUID.randomUUID().toString().substring(0, 4);
    }

}
