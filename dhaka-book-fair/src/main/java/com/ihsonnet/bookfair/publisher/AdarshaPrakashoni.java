package com.ihsonnet.bookfair.publisher;

import com.ihsonnet.bookfair.event.ComedyBookPublishedEvent;
import com.ihsonnet.bookfair.event.ProgrammingBookPublishedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AdarshaPrakashoni {

    @Autowired
    ApplicationEventPublisher publisher;

    public AdarshaPrakashoni(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishProgrammingBook(String bookNo, String bookName) {
        System.out.println("Adarsha Prakashoni - Publishing Book No " + bookNo + " - " + bookName);
        publisher.publishEvent(new ProgrammingBookPublishedEvent(bookNo, bookName));
    }

    public void publishComedyBook(String bookNo, String bookName) {
        System.out.println("Adarsha Prakashoni - Publishing Book No " + bookNo + " - " + bookName);
        publisher.publishEvent(new ComedyBookPublishedEvent(bookNo, bookName));
    }
}
