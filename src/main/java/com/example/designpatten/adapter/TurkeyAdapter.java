package com.example.designpatten.adapter;

/**
 * 鸭子不够，火鸡来凑，添加火鸡适配器
 */
public class TurkeyAdapter implements Duck{

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }


    public void fly() {
        turkey.fly();
    }
}
