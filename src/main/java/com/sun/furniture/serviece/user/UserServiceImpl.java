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
 * @author 38600
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper mapper;

    @Override
    public List<User> getUsers() {
       return  mapper.getUsers();
    }
}
