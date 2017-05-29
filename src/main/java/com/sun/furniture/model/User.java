package com.sun.furniture.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <b><code>User</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/5/29 20:59
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@ApiModel(value = "用户")
public class User implements Serializable{

    @ApiModelProperty(value = "主键ID")
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String name;

    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * Return the Name
     *
     * @return property value of name
     * @since gempile-model 0.1.0
     */
    public String getName() {
        return name;
    }

    /**
     * Set the Name
     *
     * @param name value to be assigned to property name
     * @since gempile-model 0.1.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return the Password
     *
     * @return property value of password
     * @since gempile-model 0.1.0
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the Password
     *
     * @param password value to be assigned to property password
     * @since gempile-model 0.1.0
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Return the Id
     *
     * @return property value of id
     * @since gempile-model 0.1.0
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the Id
     *
     * @param id value to be assigned to property id
     * @since gempile-model 0.1.0
     */
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
