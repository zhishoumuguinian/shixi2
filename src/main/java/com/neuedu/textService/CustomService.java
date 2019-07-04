package com.neuedu.textService;

import com.neuedu.pojo.Custom;
import com.neuedu.pojo.Orders;
import org.hibernate.criterion.Order;

import java.util.List;

/**
 * @author 赵鑫
 * @create 2019-07-04 8:48
 */
public interface CustomService {
    /**
     * 获取所有的订单
     * @return
     */
    List<Orders> getOrders();

    /**
     * 基于id获取订单详细
     * @param id
     * @return
     */
    Orders getOrderById(int id);

    /**
     * 基于id删除订单
     * @param id
     */
    void deleteOrderById(int id);

    /**
     * 修改用户名
     * @param custom
     */

    void updateName(Custom custom);

    /**
     * 增加订单
     * @param order
     */
    void addOrder(Orders order);



}
