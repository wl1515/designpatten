package com.example.designpatten.singleton.hungry;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungry ;

    private HungryStaticSingleton(){

    }
    static {
        hungry = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return hungry;
    }
}
