package com.kodigo.jd20.chat.model;

import java.time.LocalDateTime;

public interface IMessage {
    User getSender();
    LocalDateTime getTimestamp();
    String getContent();
}