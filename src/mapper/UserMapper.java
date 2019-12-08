package mapper;

import pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    User login(User user);
    List<User> getUserList(HashMap map);
    Integer userCount();
    int delete(Integer id);
    int add(User user);
    int updateUserList(User user);
}
