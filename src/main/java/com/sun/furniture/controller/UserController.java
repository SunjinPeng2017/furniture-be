package com.sun.furniture.controller;

import com.sun.furniture.model.User;
import com.sun.furniture.serviece.IUserService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
     * 添加一个用户
     *
     * @param user 用户信息
     * @return void
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "添加用户", httpMethod = "POST", notes = "添加用户")
    public ResponseEntity<?> addUser(
            @ApiParam(value = "用户信息", required = true) @RequestBody User user
    ) {
        try {
            service.insertUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * 删除一个用户
     *
     * @param name 用户名
     * @return void
     */
    @RequestMapping(value = "/user", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "删除用户", httpMethod = "DELETE", notes = "删除一个用户")
    public ResponseEntity<?> deleteUser(
            @ApiParam(value = "用户名", required = true) @RequestParam(value = "name") String name
    ) {
        try {
            service.deleteUser(name);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

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
     * @param name     用户名
     * @param password 密码(可为null)
     * @return 查询到的用户
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "根据用户名和密码查询", httpMethod = "GET", notes = "根据用户名和密码查询", response = User.class)
    public ResponseEntity<?> getUserByNameAndPwd(
            @ApiParam(value = "用户名", required = true) @RequestParam(value = "name") String name,
            @ApiParam(value = "密码") @RequestParam(value = "password", required = false) String password
    ) {
        try {
            User user = service.getUserByNameAndPwd(name, password);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     * @return void
     */
    @RequestMapping(value = "/user", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "更新用户", httpMethod = "PUT", notes = "更新一个用户")
    public ResponseEntity<?> updateUser(
            @ApiParam(value = "用户信息", required = true) @RequestBody User user
    ) {
        try {
            service.updateUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }
}
