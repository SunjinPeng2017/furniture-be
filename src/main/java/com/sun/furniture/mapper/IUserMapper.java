package com.sun.furniture.mapper;

import com.sun.furniture.model.User;

import java.util.List;

/**
 * <b><code>IUserMapper</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/5/29 21:12
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
public interface IUserMapper {

    /**
     * 添加用户
     *
     * @param user 用户信息
     */
    void insertUser(User user);

    /**
     * 删除一个用户
     *
     * @param name 用户名
     */
    void deleteUser(String name);

    /**
     * getUsers
     *
     * @return   返回数据库所有的用户
     */
    List<User> getUsers();

    /**
     * @param name  用户名
     * @param password 密码
     * @return   返回查询到结果的用户
     */
    User getUserByNameAndPwd(String name,String password);

    /**
     * 更新用户
     *
     * @param user 用户信息
     */
    void updateUser(User user);
}
