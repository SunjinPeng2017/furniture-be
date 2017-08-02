package com.sun.furniture.mapper;

import com.sun.furniture.model.SaleOrder;

import java.util.List;

/**
 * <b><code>ISaleOrderService</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 15:03
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
public interface ISaleOrderMapper {

    List<SaleOrder> getSaleOrders();

    void addSaleOrder(SaleOrder saleOrder);

    SaleOrder getSaleOrderByNumber(String saleNumber);

    void deleteSaleOrder(Integer id);

    void updateSaleOrder(SaleOrder saleOrder);
}
