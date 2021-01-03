package org.users.service;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import org.users.domain.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsersService {

    Map<String, User> usersMap = new LinkedHashMap<>();

    public User save(User user){
        return usersMap.put(user.getId(), user);
    }

    public List<User> findAll(){
        return new ArrayList<>(usersMap.values());
    }

    public User findOne(String id){
        return usersMap.get(id);
    }

    public void delete(String id){
        usersMap.remove(id);
    }

    public boolean exists(String id){
        return ObjectUtils.isNotEmpty(usersMap.get(id));
    }
}
