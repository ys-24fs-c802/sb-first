package kr.co.cofile.sbfirst;

import kr.co.cofile.sbfirst.chapter03.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbFirstApplication.class, args)
                .getBean(SbFirstApplication.class).execute();
    }

    @Autowired
    Greet greet;

    private void execute() {
        greet.greeting();
    }
}
