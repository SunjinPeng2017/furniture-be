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

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "电话号码")
    private String phoneNumber;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "权限")
    private String permission;

    @ApiModelProperty(value = "注册时间")
    private String registerTime;

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


    /**
     * Return the Sex
     *
     * @return property value of sex
     * @since gempile-model 0.1.0
     */
    public String getSex() {
        return sex;
    }

    /**
     * Set the Sex
     *
     * @param sex value to be assigned to property sex
     * @since gempile-model 0.1.0
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * Return the PhoneNumber
     *
     * @return property value of phoneNumber
     * @since gempile-model 0.1.0
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the PhoneNumber
     *
     * @param phoneNumber value to be assigned to property phoneNumber
     * @since gempile-model 0.1.0
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Return the Adress
     *
     * @return property value of address
     * @since gempile-model 0.1.0
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the Adress
     *
     * @param address value to be assigned to property address
     * @since gempile-model 0.1.0
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Return the Permission
     *
     * @return property value of permission
     * @since gempile-model 0.1.0
     */
    public String getPermission() {
        return permission;
    }

    /**
     * Set the Permission
     *
     * @param permission value to be assigned to property permission
     * @since gempile-model 0.1.0
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Return the RegisterTime
     *
     * @return property value of registerTime
     * @since gempile-model 0.1.0
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /**
     * Set the RegisterTime
     *
     * @param registerTime value to be assigned to property registerTime
     * @since gempile-model 0.1.0
     */
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", permission='" + permission + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }
}
