package com.ihsonnet.bookfair;

import com.ihsonnet.bookfair.publisher.AdarshaPrakashoni;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@SpringBootApplication
public class DhakaBookFairApplication {

    @Bean(name = "applicationEventMulticaster")
    public ApplicationEventMulticaster makingAsync() {
        SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());

        return eventMulticaster;
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DhakaBookFairApplication.class, args);
        AdarshaPrakashoni adarshaPrakashoni = context.getBean(AdarshaPrakashoni.class);
        adarshaPrakashoni.publishProgrammingBook("P-001", "Java Programming");
        adarshaPrakashoni.publishComedyBook("C-001", "The Alchemist");
    }

}
