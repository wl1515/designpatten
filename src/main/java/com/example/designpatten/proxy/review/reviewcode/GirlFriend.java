package com.example.designpatten.proxy.review.reviewcode;

import com.example.designpatten.proxy.review.Girl;
import com.example.designpatten.proxy.review.Pursuit;

public class GirlFriend implements GiveGift{

   Pursuit pursuit;

    public GirlFriend(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    public void giveDolls() {
        pursuit.giveDolls();
    }

    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}