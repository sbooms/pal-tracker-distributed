package io.pivotal.pal.tracker.eurekaserver.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import java.util.TimeZone;

<<<<<<< HEAD:applications/registration-server/src/main/java/io/pivotal/pal/tracker/registration/App.java

=======
>>>>>>> c19ee764c9199e70db9f795d9f2f18e143ccc39a:applications/registration-server/src/main/java/io/pivotal/pal/tracker/eurekaserver/registration/App.java
@EnableEurekaClient
@SpringBootApplication
@ComponentScan({
    "io.pivotal.pal.tracker.accounts",
    "io.pivotal.pal.tracker.restsupport",
    "io.pivotal.pal.tracker.projects",
    "io.pivotal.pal.tracker.users",
    "io.pivotal.pal.tracker.registration"
})
public class App {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(App.class, args);
    }
}
