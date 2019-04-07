package com.example.designpatten.proxy.staticproxy.simpleproxy;

public class FatherProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findlove();
    }
}
