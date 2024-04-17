package app.config;

import app.staff.administration.Director;
import app.staff.administration.ProductionChief;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProductionChief productionChief() {
        return new ProductionChief();
    }

    @Bean
    public Director director() {
        return new Director();
    }



}
