package com.example.designpatten.singleton.test.singleton;

import com.example.designpatten.singleton.test.singleton.ExecutorThread;

//测试懒汉式单例的线程安全问题
public class LazySingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("Executor End");
    }
}
