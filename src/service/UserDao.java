package service;

import pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserDao {
    User login(User user);
    List<User> getUserList(HashMap map);
    Integer userCount();
    int delete(Integer id);
    int add(User user);
    int updateUserList(User user);
    int endLoginTime(HashMap map);
}
