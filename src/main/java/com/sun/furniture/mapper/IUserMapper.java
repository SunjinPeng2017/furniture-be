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
}
