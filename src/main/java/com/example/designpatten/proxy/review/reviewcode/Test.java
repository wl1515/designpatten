package com.example.designpatten.proxy.review.reviewcode;

import com.example.designpatten.proxy.review.Girl;

public class Test {

    public static void main(String[] args) {
        Girl girl = new Girl("莉莉");

        GirlFriend girlFriend = new GirlFriend(girl);
        girlFriend.giveFlowers();
        girlFriend.giveDolls();
        girlFriend.giveChocolate();
    }
}
