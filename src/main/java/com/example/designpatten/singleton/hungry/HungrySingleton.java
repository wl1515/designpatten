package com.example.designpatten.singleton.hungry;

public class HungrySingleton {

    private static final HungrySingleton hungry = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungry;
    }
}
