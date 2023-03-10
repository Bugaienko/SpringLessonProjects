package homework33.autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Sergii Bugaienko
 */

@Configuration
@ComponentScan("homework33.autowired")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
