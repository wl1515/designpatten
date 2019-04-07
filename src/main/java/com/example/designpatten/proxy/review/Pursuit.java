package com.example.designpatten.proxy.review;

public class Pursuit {

    private Girl girl;

    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    public void giveDolls(){
        System.out.println(girl.getName() + " 送你洋娃娃");
    }

    public void giveFlowers(){
        System.out.println(girl.getName() + " 送你鲜花");
    }

    public void giveChocolate(){
        System.out.println(girl.getName() + " 送你巧克力");
    }

}
