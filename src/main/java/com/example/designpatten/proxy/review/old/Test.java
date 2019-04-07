package com.example.designpatten.proxy.review.old;

import com.example.designpatten.proxy.review.Girl;
import com.example.designpatten.proxy.review.Pursuit;

/**
 * 追求者不认识莉莉
 */
public class Test {

    public static void main(String[] args) {
        Girl girl = new Girl("莉莉");

        Pursuit pursuit = new Pursuit(girl);
        pursuit.giveFlowers();
        pursuit.giveDolls();
        pursuit.giveChocolate();
    }

}
