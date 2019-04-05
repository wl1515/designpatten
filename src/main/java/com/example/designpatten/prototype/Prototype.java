package com.example.designpatten.prototype;


import com.example.designpatten.prototype.entity.Orders;

public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        //未使用原型模式
        Orders ordersOne = new Orders();
        ordersOne.setAppId("1");
        ordersOne.setAppToken("a");
        ordersOne.setAutoId(1);
        ordersOne.setId(1);
        Orders ordersTwo = new Orders();
        ordersTwo.setAppId("1");
        ordersTwo.setAppToken("a");
        ordersTwo.setAutoId(1);
        ordersTwo.setId(2);

        //使用原型模式
        Orders ordersFisrt = new Orders();
        ordersFisrt.setAppId("1");
        ordersFisrt.setAppToken("a");
        ordersFisrt.setAutoId(1);
        ordersFisrt.setId(1);
        System.out.println("appId: " + ordersFisrt.getAppId() + " " +  "appToken: " + ordersFisrt.getAppToken() + " " +  "autoId: "
                + ordersFisrt.getAutoId() + " " +  "id: " + ordersFisrt.getId());
        Orders ordersSecond = ordersFisrt.clone();
        ordersSecond.setId(2);
        System.out.println("appId: " + ordersSecond.getAppId() + " " + "appToken: " + ordersSecond.getAppToken() + " " +  "autoId: "
                + ordersSecond.getAutoId() + " " +  "id: " + ordersSecond.getId());
    }
}
