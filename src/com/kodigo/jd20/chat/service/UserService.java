package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserService implements IUserService {

    private final Map<String, User> users = new HashMap<>();

    @Override
    public User createUser(String name) {
        String id = UUID.randomUUID().toString();
        User user = new User(id, name);
        users.put(id, user);
        return user;
    }

    @Override
    public User getUser(String id) {
        return users.get(id);
    }
}
