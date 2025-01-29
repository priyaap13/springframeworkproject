package com.example.LearningSpringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole{
    public void up(){
        System.out.println("Jump Pac");
    }
    public void down(){
        System.out.println("Go Down into hole Pacman");
    }
    public void left(){
        System.out.println("stop Pac");
    }
    public void right(){
        System.out.println("accelerate Pac!");
    }
}
