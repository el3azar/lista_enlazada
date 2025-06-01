package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.Chat;
import com.kodigo.jd20.chat.model.IMessage;
import com.kodigo.jd20.chat.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatService implements IChatService {

    private final Map<String, Chat> chats = new HashMap<>();
    private int chatCounter = 1;

    @Override
    public Chat createChat() {
        String id = "chat-" + chatCounter++;
        Chat chat = new Chat(id);
        chats.put(id, chat);
        return chat;
    }

    @Override
    public void sendMessage(String chatId, User user, IMessage message) {
        Chat chat = chats.get(chatId);
        if (chat != null) {
            chat.addMessage(message);
        } else {
            System.out.println("Chat no encontrado.");
        }
    }

    @Override
    public void addUserToChat(String chatId, User user) {
        Chat chat = chats.get(chatId);
        if (chat != null) {
            chat.addParticipant(user);
        } else {
            System.out.println("Chat no encontrado.");
        }
    }

    @Override
    public List<IMessage> getMessages(String chatId) {
        Chat chat = chats.get(chatId);
        if (chat != null) {
            chat.getMessages().showAll(); // muestra directamente la lista enlazada
        } else {
            System.out.println("Chat no encontrado.");
        }
        return null;
    }
}
