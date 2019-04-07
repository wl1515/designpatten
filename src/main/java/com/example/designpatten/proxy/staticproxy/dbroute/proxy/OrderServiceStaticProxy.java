package com.example.designpatten.proxy.staticproxy.dbroute.proxy;

import com.example.designpatten.proxy.staticproxy.dbroute.IOrderService;
import com.example.designpatten.proxy.staticproxy.dbroute.Order;
import com.example.designpatten.proxy.staticproxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService){ this.orderService = orderService;}

    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbRoute = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRoute + "】");
        DynamicDataSourceEntity.set(dbRoute);

        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();

        return 0;
    }

}
