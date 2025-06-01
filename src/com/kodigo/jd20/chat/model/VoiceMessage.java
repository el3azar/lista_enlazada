package com.kodigo.jd20.chat.model;

import java.time.LocalDateTime;

public class VoiceMessage implements IMessage {
    private User sender;
    private String audioUrl;
    private LocalDateTime timestamp;

    public VoiceMessage(User sender, String audioUrl, LocalDateTime timestamp) {
        this.sender = sender;
        this.audioUrl = audioUrl;
        this.timestamp = timestamp;
    }

    @Override
    public User getSender() {
        return sender;
    }

    @Override
    public String getContent() {
        return "[Voice] " + audioUrl;
    }

    @Override
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}