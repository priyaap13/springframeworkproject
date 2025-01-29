package com.example.LearningSpringframework;

import com.example.LearningSpringframework.enterprise.example.web.MyController;
import com.example.LearningSpringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestfulApiApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(RestfulApiApplication.class, args);

//		PacMan game = new PacMan();

//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		GamingConsole game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);

        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();
        MyController controller = context.getBean(MyController.class);
        System.out.println(controller.returnValuefromBusinessService());


    }

}
