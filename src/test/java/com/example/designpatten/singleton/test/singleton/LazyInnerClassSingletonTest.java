package com.example.designpatten.singleton.test.singleton;

import com.example.designpatten.singleton.lazy.LazyInnerClassSingleton;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        System.out.println(LazyInnerClassSingleton.getInstance());
        System.out.println(LazyInnerClassSingleton.getInstance());
    }
}
