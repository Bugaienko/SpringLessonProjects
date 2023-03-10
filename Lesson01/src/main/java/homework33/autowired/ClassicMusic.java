package homework33.autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Sergii Bugaienko
 */
@Component
@Scope("prototype")
public class ClassicMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Do my initialization (Classic Music)");
    }

    // Для prototype бинов не вызывается destroy-метод
     @PreDestroy
    public void doMyDestroy() {
        System.out.println("Do my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
