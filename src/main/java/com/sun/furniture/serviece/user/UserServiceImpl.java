package com.sun.furniture.serviece.user;

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
}
