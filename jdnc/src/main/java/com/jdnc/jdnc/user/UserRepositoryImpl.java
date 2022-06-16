package com.jdnc.jdnc.user;
import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {

    private static Map<Long,User> users = new HashMap<>();

    public void saveUser(User user){
        users.put(user.getId(),user);
    }

    public User findByUserId(Long userId){
        return users.get(userId);
    }


}
