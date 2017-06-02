package com.sun.furniture.serviece;

import com.sun.furniture.mapper.ICustomerMapper;
import com.sun.furniture.model.CustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <b><code>CustomerServiceImpl</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2017/6/2 14:18
 *
 * @author sunjinpeng
 * @version 0.1.0
 * @since furniture-be 0.1.0
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerMapper mapper;

    /**
     * @return 返回所有的客户信息
     */
    @Override
    public List<CustomerInfo> getCustomerInfo() {
        return mapper.getCustomerInfo();
    }
}
