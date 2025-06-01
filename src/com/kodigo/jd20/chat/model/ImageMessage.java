package com.kodigo.jd20.chat.model;

import java.time.LocalDateTime;

public class ImageMessage implements IMessage {
    private User sender;
    private String imageUrl;
    private LocalDateTime timestamp;

    public ImageMessage(User sender, String imageUrl, LocalDateTime timestamp) {
        this.sender = sender;
        this.imageUrl = imageUrl;
        this.timestamp = timestamp;
    }

    @Override
    public User getSender() {
        return sender;
    }

    @Override
    public String getContent() {
        return "[Image] " + imageUrl;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}