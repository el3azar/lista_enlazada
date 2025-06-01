package com.kodigo.jd20.chat.model;

import java.time.LocalDateTime;

public class Message implements IMessage {
    private User sender;
    private String content;
    private LocalDateTime timestamp;

    public Message(User sender, String content, LocalDateTime timestamp) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }

    @Override
    public User getSender() {
        return sender;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}