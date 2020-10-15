package it.scuccimarri.joke.config;

import guru.springframework.norris.chuck.*;
import org.springframework.context.annotation.*;

@Configuration
public class ChuckConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
