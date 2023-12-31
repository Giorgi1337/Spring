package GE.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("GE.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
