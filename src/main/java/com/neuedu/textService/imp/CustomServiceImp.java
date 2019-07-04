package com.neuedu.textService.imp;

import com.neuedu.mapper.CustomMapper;
import com.neuedu.mapper.GoodsMapper;
import com.neuedu.mapper.OrderDetailMapper;
import com.neuedu.mapper.OrdersMapper;
import com.neuedu.pojo.Custom;
import com.neuedu.pojo.Orders;
import com.neuedu.textService.CustomService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 赵鑫
 * @create 2019-07-04 9:13
 */
public class CustomServiceImp implements CustomService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private CustomMapper customMapper;

    public List<Orders> getOrders() {
        List<Orders> orders = ordersMapper.listOrders();
        return orders;
    }

    public Orders getOrderById(int id) {
        return ordersMapper.selectByPrimaryKey(id);
    }

    public void deleteOrderById(int id) {
        ordersMapper.deleteByPrimaryKey(id);
    }

    public void updateName(Custom custom) {
        customMapper.updateByPrimaryKey(custom);
    }

    public void addOrder(Orders order) {
        ordersMapper.insert(order);
    }
}
