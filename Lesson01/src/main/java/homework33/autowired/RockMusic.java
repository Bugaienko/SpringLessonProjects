package homework33.autowired;

import org.springframework.stereotype.Component;

/**
 * @author Sergii Bugaienko
 */

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "We are the Champions!";
    }
}
