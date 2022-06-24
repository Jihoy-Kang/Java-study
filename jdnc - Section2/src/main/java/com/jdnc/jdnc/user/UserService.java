package com.jdnc.jdnc.user;

public interface UserService {
    void signup(User user);
    User findUser(Long userId);
}
