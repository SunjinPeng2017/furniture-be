package com.sun.furniture.mapper;

import com.sun.furniture.model.CustomerInfo;

import java.util.List;

/**
 * <b><code>ICustomerMapper</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 14:05
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
public interface ICustomerMapper {

    /**
     * @return 返回所有的客户信息
     */
    List<CustomerInfo> getCustomerInfo();
}
