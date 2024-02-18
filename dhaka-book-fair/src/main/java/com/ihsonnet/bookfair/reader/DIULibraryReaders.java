package com.ihsonnet.bookfair.reader;

import com.ihsonnet.bookfair.event.ProgrammingBookPublishedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DIULibraryReaders {
    private String readerId = "DIU-001";

    @EventListener
    public void onProgrammingBookPublished(ProgrammingBookPublishedEvent event) {
        System.out.println("DIULibraryReaders - reader id ( "+readerId+ " ) is reading : Book No " + event.getBookNo() + " - " + event.getBookName());
    }
}
