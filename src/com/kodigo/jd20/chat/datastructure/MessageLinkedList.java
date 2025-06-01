package com.kodigo.jd20.chat.datastructure;

import com.kodigo.jd20.chat.model.IMessage;

public class MessageLinkedList {
    private MessageNode head;

    public void add(IMessage message) {
        MessageNode newMessageNode = new MessageNode(message);

        if (head == null) {
            head = newMessageNode;
        } else {
            MessageNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newMessageNode);
        }
    }

    public void showAll() {
        MessageNode current = head;
        while (current != null) {
            IMessage message = current.getMessage();
            System.out.println("[" + message.getTimestamp() + "] " +
                    message.getSender().getName() + ": " +
                    message.getContent());
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
