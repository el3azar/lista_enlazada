package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.Chat;
import com.kodigo.jd20.chat.model.IMessage;
import com.kodigo.jd20.chat.model.User;
import java.util.List;

public interface IChatService {
    void sendMessage(String chatId, User user, IMessage message);
    void addUserToChat(String chatId, User user);
    Chat createChat();
    List<IMessage> getMessages(String chatId);
}