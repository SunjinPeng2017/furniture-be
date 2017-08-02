package com.sun.furniture.controller;

import com.sun.furniture.model.CustomerInfo;
import com.sun.furniture.serviece.ICustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <b><code>CustomerController</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 13:58
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@RestController
@RequestMapping(value = "/v1.0")
@Api(tags = "客户信息管理相关接口")
public class CustomerController {

    @Autowired
    private ICustomerService service;

    /**
     * @return 查询客户信息
     */
    @RequestMapping(value = "/customer", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "查询客户信息", httpMethod = "GET", notes = "查询客户信息")
    public ResponseEntity<?> getCustomerInfo() {
        try {
            List<CustomerInfo> results = service.getCustomerInfo();
            return new ResponseEntity<>(results, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }
}
