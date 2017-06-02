package com.sun.furniture.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <b><code>EChartsData</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 13:16
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@RestController
@RequestMapping(value = "/v1.0")
@Api(tags = "ECharts 相关数据接口")
public class EChartsDataController {


    /**
     * @return 查询 ECharts 数据
     */
    @RequestMapping(value = "/EChartsData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful Request!"),
            @ApiResponse(code = 500, message = "Internal server error!")
    })
    @ApiOperation(value = "查询 ECharts 数据", httpMethod = "GET", notes = "查询 ECharts 数据")
    public ResponseEntity<?> getEChartsData() {
        try {
            Map<String, List<Integer>> results = new HashMap<>();

            //总订单数据
            List<Integer> totalOrder = new ArrayList<>();
            totalOrder.add(250);
            totalOrder.add(207);
            totalOrder.add(297);
            totalOrder.add(320);
            totalOrder.add(204);
            totalOrder.add(153);
            totalOrder.add(101);
            totalOrder.add(140);
            totalOrder.add(323);
            totalOrder.add(76);
            totalOrder.add(163);
            totalOrder.add(236);

            //已处理订单数据
            List<Integer> dealOrder = new ArrayList<>();
            dealOrder.add(0);
            dealOrder.add(110);
            dealOrder.add(125);
            dealOrder.add(145);
            dealOrder.add(122);
            dealOrder.add(165);
            dealOrder.add(122);
            dealOrder.add(220);
            dealOrder.add(182);
            dealOrder.add(191);
            dealOrder.add(134);
            dealOrder.add(150);

            //未处理订单数据
            List<Integer> notDealOrder = new ArrayList<>();
            notDealOrder.add(0);
            notDealOrder.add(182);
            notDealOrder.add(125);
            notDealOrder.add(145);
            notDealOrder.add(122);
            notDealOrder.add(191);
            notDealOrder.add(134);
            notDealOrder.add(150);
            notDealOrder.add(120);
            notDealOrder.add(110);
            notDealOrder.add(165);
            notDealOrder.add(122);

            results.put("totalOrder", totalOrder);
            results.put("dealOrder", dealOrder);
            results.put("notDealOrder", notDealOrder);
            return new ResponseEntity<>(results, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

}
