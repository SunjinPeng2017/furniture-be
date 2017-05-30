package com.sun.furniture.controller;

import com.sun.furniture.model.User;
import com.sun.furniture.serviece.user.IUserService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <b><code>UserController</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/5/29 21:20
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@RestController
@RequestMapping(value = "/v1.0")
@Api(tags = "用户管理相关接口")
public class UserController {

    /**
     * LOG
     */
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService service;

    /**
     * @return 所有用户列表
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "查询所有用户", httpMethod = "GET", notes = "查询所有用户", response = User.class)
    public ResponseEntity<?> getUsers() {
        try {
            List<User> users = service.getUsers();
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * @param name  用户名
     * @param password 密码(可为null)
     * @return  查询到的用户
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "根据用户名和密码查询", httpMethod = "GET", notes = "根据用户名和密码查询", response = User.class)
    public ResponseEntity<?> getUserByNameAndPwd(
            @ApiParam(value = "用户名", required = true) @RequestParam(value = "name") String name,
            @ApiParam(value = "密码") @RequestParam(value = "password",required = false) String password
    ) {
        try {
            User user = service.getUserByNameAndPwd(name, password);
            return new ResponseEntity<>(user,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e,HttpStatus.BAD_REQUEST);
        }
    }
}
