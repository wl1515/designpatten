package com.example.designpatten.singleton.lazy;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySingleton = null;

    private LazySimpleSingleton(){ }

    public static LazySimpleSingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySimpleSingleton();
        }
        return  lazySingleton;
    }
}
