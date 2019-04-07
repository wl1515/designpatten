package com.example.designpatten.strategy.reviewcode;

public class Test {

    public static void main(String[] args) {
        Integer way = 1;
        Discout discout = DiscoutFactory.getDiscoutWay(way);
        discout.doDiscout();
    }

}
