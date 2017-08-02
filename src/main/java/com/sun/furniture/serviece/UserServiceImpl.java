package com.sun.furniture.serviece;

import com.sun.furniture.mapper.IUserMapper;
import com.sun.furniture.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <b><code>UserServiceImpl</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/5/29 21:25
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper mapper;


    /**
     * 添加用户
     *
     * @param user 用户信息
     */
    @Override
    public void insertUser(User user) {
        mapper.insertUser(user);
    }

    /**
     * 删除一个用户
     *
     * @param name 用户名
     */
    @Override
    public void deleteUser(String name) {
        mapper.deleteUser(name);
    }

    /**
     * @return  返回所有的用户
     */
    @Override
    public List<User> getUsers() {
       return  mapper.getUsers();
    }

    /**
     * @param name     用户名
     * @param password 密码 （可为null）
     * @return 查询到的用户
     */
    @Override
    public User getUserByNameAndPwd(String name, String password) {
        User user = mapper.getUserByNameAndPwd(name,password);
        return user;
    }

    /**
     * 更新用户
     *
     * @param user 用户信息
     */
    @Override
    public void updateUser(User user) {
        mapper.updateUser(user);
    }
}
