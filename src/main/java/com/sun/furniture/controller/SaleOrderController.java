package com.sun.furniture.controller;

import com.sun.furniture.model.SaleOrder;
import com.sun.furniture.serviece.ISaleOrderService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <b><code>SaleOrderController</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 17:48
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@RestController
@RequestMapping(value = "/v1.0")
@Api(tags = "管理销售订单的相关接口")
public class SaleOrderController {

    @Autowired
    private ISaleOrderService service;

    /**
     * 添加一个订单
     *
     * @param saleOrder 订单信息
     * @return void
     */
    @RequestMapping(value = "/saleOrder", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "添加销售订单", httpMethod = "POST", notes = "添加销售订单")
    public ResponseEntity<?> addSaleOrder(
            @ApiParam(value = "销售订单信息", required = true) @RequestBody SaleOrder saleOrder
    ) {
        try {
            service.addSaleOrder(saleOrder);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * 删除一个销售订单
     *
     * @param id 销售订单
     * @return void
     */
    @RequestMapping(value = "/saleOrder", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "删除一个销售订单", httpMethod = "DELETE", notes = "删除一个销售订单")
    public ResponseEntity<?> deleteSaleOrder(
            @ApiParam(value = "id", required = true) @RequestParam(value = "id") Integer id
    ) {
        try {
            service.deleteSaleOrder(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * @return 所有销售订单列表
     */
    @RequestMapping(value = "/saleOrders", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "查询所有销售订单", httpMethod = "GET", notes = "查询所有销售订单", response = SaleOrder.class)
    public ResponseEntity<?> getSaleOrders() {
        try {
            List<SaleOrder> results = service.getSaleOrders();
            return new ResponseEntity<>(results, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * @param saleNumber 订单号
     * @return 查询到的用户
     */
    @RequestMapping(value = "/saleOrder", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "根据订单号查询销售订单", httpMethod = "GET", notes = "根据订单号查询销售订单", response = SaleOrder.class)
    public ResponseEntity<?> getSaleOrderByNumber(
            @ApiParam(value = "订单号", required = true) @RequestParam(value = "saleNumber") String saleNumber
    ) {
        try {
            SaleOrder saleOrder = service.getSaleOrderByNumber(saleNumber);
            return new ResponseEntity<>(saleOrder, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * 更新销售订单信息
     *
     * @param saleOrder 销售订单
     * @return void
     */
    @RequestMapping(value = "/saleOrder", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "更新一个销售订单", httpMethod = "PUT", notes = "更新一个销售订单")
    public ResponseEntity<?> updateSaleOrder(
            @ApiParam(value = "销售订单", required = true) @RequestBody SaleOrder saleOrder
    ) {
        try {
            service.updateSaleOrder(saleOrder);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }
}
