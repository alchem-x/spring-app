package app;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import static java.io.IO.println;

@Component
public class App implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        println("Hello");
    }
}
