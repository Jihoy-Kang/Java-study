package com.jdnc.jdnc.user;

public interface UserRepository {
    void saveUser(User user);
    User findByUserId(Long userId);
}
