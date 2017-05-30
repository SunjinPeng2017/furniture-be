package com.sun.furniture.serviece.user;

import com.sun.furniture.model.User;

import java.util.List;

/**
 * <b><code>IUserService</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/5/29 21:25
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
public interface IUserService {

    /**
     * @return  返回所有的用户
     */
    List<User> getUsers();

    /**
     * @param name  用户名
     * @param password  密码 （可为null）
     * @return  查询到的用户
     */
    User getUserByNameAndPwd(String name ,String password);
}
