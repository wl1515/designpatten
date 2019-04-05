package com.example.designpatten.singleton.threadlocal;

public class ThreaLocalSingleton {

    private ThreaLocalSingleton(){};

    private static final ThreadLocal<ThreaLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreaLocalSingleton>(){
                @Override
                protected ThreaLocalSingleton initialValue() {
                    return new ThreaLocalSingleton();
                }
            };

    private static ThreaLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }

}
