package com.kodigo.jd20.chat.datastructure;


import com.kodigo.jd20.chat.model.IMessage;
// 3
public class MessageNode {
   private final  IMessage message;
    private MessageNode next;

    public MessageNode(IMessage message) {
        this.message = message;
        this.next = null;
    }

    public IMessage getMessage() {
        return message;
    }

    public MessageNode getNext() {
        return next;
    }

    public void setNext(MessageNode next) {
        this.next = next;
    }
}
