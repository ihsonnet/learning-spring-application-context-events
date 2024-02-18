package com.ihsonnet.bookfair;

import com.ihsonnet.bookfair.publisher.AdarshaPrakashoni;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DhakaBookFairApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DhakaBookFairApplication.class, args);
        AdarshaPrakashoni adarshaPrakashoni = context.getBean(AdarshaPrakashoni.class);
        adarshaPrakashoni.publishProgrammingBook("P-001", "Java Programming");
        adarshaPrakashoni.publishComedyBook("C-001", "The Alchemist");
    }

}
