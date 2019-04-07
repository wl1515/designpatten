package com.example.designpatten.proxy.staticproxy.simpleproxy;

import com.example.designpatten.proxy.Person;

public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("对象要求 : 魔鬼身材天使面孔" );
    }
}
