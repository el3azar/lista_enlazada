package com.kodigo.jd20.chat.model;

import com.kodigo.jd20.chat.datastructure.MessageLinkedList;

public class Chat {
    private String id;
    private User[] participants;
    private int participantCount = 0;
    private MessageLinkedList messages;

    public Chat(String id) {
        this.id = id;
        this.participants = new User[10];
        this.messages = new MessageLinkedList();
    }

    public String getId() {
        return id;
    }

    public void addParticipant(User user) {
        if (participantCount < participants.length) {
            participants[participantCount++] = user;
        } else {
            System.out.println("Número máximo de participantes alcanzado.");
        }
    }

    public void addMessage(IMessage message) {
        messages.add(message);
    }

    public MessageLinkedList getMessages() {
        return messages;
    }

    public User[] getParticipants() {
        return participants;
    }
}
