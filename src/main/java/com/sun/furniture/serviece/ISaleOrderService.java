package com.sun.furniture.serviece;

import com.sun.furniture.model.SaleOrder;

import java.util.List;

/**
 * <b><code>ISaleOrderService</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 17:41
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
public interface ISaleOrderService {


    List<SaleOrder> getSaleOrders();

    void addSaleOrder(SaleOrder saleOrder);

    SaleOrder getSaleOrderByNumber(String saleNumber);

    void deleteSaleOrder(Integer id);

    void updateSaleOrder(SaleOrder saleOrder);
}
