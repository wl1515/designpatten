package com.example.designpatten.singleton.lazy;



public class LazyInnerClassSingleton {

    //防止反射破坏
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //懒汉式单例
    //LazyHolder里面的逻辑需要等到外部方法调用时才执行
    //巧妙利用了内部类的特性
    //JVM底层执行逻辑，完美地避免了线程安全问题
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static  class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
