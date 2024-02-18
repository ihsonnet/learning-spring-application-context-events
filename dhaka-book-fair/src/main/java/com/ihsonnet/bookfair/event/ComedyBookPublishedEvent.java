package com.ihsonnet.bookfair.event;

import org.springframework.context.ApplicationEvent;

public class ComedyBookPublishedEvent {
    private String bookNo;
    private String bookName;
    public String getBookNo() {
        return bookNo;
    }
    public String getBookName() {
        return bookName;
    }
    public ComedyBookPublishedEvent(String bookNo, String bookName) {
        this.bookNo = bookNo;
        this.bookName = bookName;
    }

    public ComedyBookPublishedEvent() {
    }
}
