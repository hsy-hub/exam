package service;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;

import java.util.HashMap;
import java.util.List;

@Service
public class UserDaoImpl implements UserDao {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public List<User> getUserList(HashMap map) {
        return userMapper.getUserList(map);
    }


    @Override
    public Integer userCount() {
        return userMapper.userCount();
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }
}
