package it.bx.config;


import io.quarkus.arc.config.ConfigProperties;
import lombok.Data;

@Data
@ConfigProperties(prefix = "greeting")
public class HelloConfiguration {
    String message;
    String name;
}
