package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.User;

public interface IUserService {
    User createUser(String name);
    User getUser(String id);
}