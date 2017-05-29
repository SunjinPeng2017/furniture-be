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
 * @author 38600
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
public interface IUserService {

    List<User> getUsers();
}
