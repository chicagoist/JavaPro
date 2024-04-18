package app.config;


import app.dojo.Judge;
import app.dojo.Kancho;
import app.dojo.kohai.bluebelt.BlueBeltGroup;
import app.dojo.kohai.whitebelt.WhiteBeltGroup;
import app.dojo.sempai.blackbelt.BlackBeltSempai;
import app.dojo.sempai.braunbelt.BraunBeltSempai;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BlueBeltGroup blueBeltCroup() {
        return new BlueBeltGroup();
    }

    @Bean
    public WhiteBeltGroup whiteBeltGroup() {
        return new WhiteBeltGroup();
    }

    @Bean
    public BlackBeltSempai blackBeltSempai() {
        return new BlackBeltSempai();
    }

    @Bean
    public BraunBeltSempai braunBeltSempai() {
        return new BraunBeltSempai();
    }

    @Bean
    public Judge judge() {
        return new Judge();
    }

    @Bean
    public Kancho kancho() {
        return new Kancho();
    }


}

