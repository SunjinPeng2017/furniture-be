package com.sun.furniture.serviece;

import com.sun.furniture.mapper.ISaleOrderMapper;
import com.sun.furniture.model.SaleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <b><code>ISaleOrderMapper</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 17:43
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@Service
public class SaleOrderServiceImpl implements ISaleOrderService {

    @Autowired
    private ISaleOrderMapper mapper;

    @Override
    public List<SaleOrder> getSaleOrders() {
        return mapper.getSaleOrders();
    }

    @Override
    public void addSaleOrder(SaleOrder saleOrder) {
        mapper.addSaleOrder(saleOrder);
    }

    @Override
    public SaleOrder getSaleOrderByNumber(String saleNumber) {
        return mapper.getSaleOrderByNumber(saleNumber);
    }

    @Override
    public void deleteSaleOrder(Integer id) {
        mapper.deleteSaleOrder(id);
    }

    @Override
    public void updateSaleOrder(SaleOrder saleOrder) {
        mapper.updateSaleOrder(saleOrder);
    }
}
