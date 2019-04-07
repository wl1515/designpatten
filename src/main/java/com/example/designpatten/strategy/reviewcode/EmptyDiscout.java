package com.example.designpatten.strategy.reviewcode;

public class EmptyDiscout implements Discout{

    public void doDiscout(){
        System.out.println("无折扣");
    }

}
