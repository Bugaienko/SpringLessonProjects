package homework33.randomMusic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Sergii Bugaienko
 */

public class StartApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.playMusic());

        context.close();

    }
}
