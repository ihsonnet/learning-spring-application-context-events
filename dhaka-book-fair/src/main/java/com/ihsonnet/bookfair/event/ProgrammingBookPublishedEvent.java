package com.ihsonnet.bookfair.event;

import org.springframework.stereotype.Component;

@Component
public class ProgrammingBookPublishedEvent {
    private String bookNo;
    private String bookName;
    public String getBookNo() {
        return bookNo;
    }
    public String getBookName() {
        return bookName;
    }

    public ProgrammingBookPublishedEvent(String bookNo, String bookName) {
        this.bookNo = bookNo;
        this.bookName = bookName;
    }

    public ProgrammingBookPublishedEvent() {
    }
}
