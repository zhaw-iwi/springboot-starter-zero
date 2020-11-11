package ch.zhaw.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hauptklasse für die InfM-Applikation
 * 
 * Die Applikation ist stark angelehnt an das Getting Started-Beispiel hier:
 * https://spring.io/guides/gs/rest-service/
 * 
 * @SpringBootApplication stellt sicher, dass diese Klasse die SpringBoot-Applikation automatisch konfiguriert und vieles mehr. Details: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-using-springbootapplication-annotation
 */
@SpringBootApplication
public class InfMApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfMApplication.class, args);
    }
}
