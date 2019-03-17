package com.example.designpatten.singleton.test;

import com.example.designpatten.singleton.lazy.LazySimpleSingleton;

public class ExecutorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazySimpleSingleton);
    }
}
