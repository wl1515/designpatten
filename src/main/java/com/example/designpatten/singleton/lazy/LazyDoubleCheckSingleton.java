package com.example.designpatten.singleton.lazy;

public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton(){ }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return  lazySingleton;
    }
}
