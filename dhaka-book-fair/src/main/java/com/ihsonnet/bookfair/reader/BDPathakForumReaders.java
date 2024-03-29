package com.ihsonnet.bookfair.reader;

import com.ihsonnet.bookfair.event.ComedyBookPublishedEvent;
import com.ihsonnet.bookfair.event.ProgrammingBookPublishedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BDPathakForumReaders {
    private String readerId = "BDPF-001";

    @EventListener
    public void onProgrammingBookPublished(ProgrammingBookPublishedEvent event) {
        System.out.println("Sleeping for 3 second Start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sleeping for 3 seconds End");
        System.out.println("BDPathakForumReaders - reader id ( "+readerId+ " ) is reading : Book No " + event.getBookNo() + " - " + event.getBookName());
    }

    @EventListener
    public void onComedyBookPublished(ComedyBookPublishedEvent event) {
        System.out.println("BDPathakForumReaders - reader id ( "+readerId+ " ) is reading : Book No " + event.getBookNo() + " - " + event.getBookName());
    }
}
