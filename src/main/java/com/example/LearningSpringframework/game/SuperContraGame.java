package com.example.LearningSpringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class SuperContraGame implements GamingConsole {

    public void up(){
        System.out.println("Supercontra up");
    }
    public void down(){
        System.out.println("Supercontra down");
    }
    public void left(){
        System.out.println("Supercontra stop");
    }
    public void right(){
        System.out.println("Supercontra accelerate");
    }
}
