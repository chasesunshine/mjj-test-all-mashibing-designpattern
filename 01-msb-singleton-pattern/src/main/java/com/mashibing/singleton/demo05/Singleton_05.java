package com.mashibing.singleton.demo05;

/**
 * 单例模式-静态内部类(懒加载)
 *     根据静态内部类的特性,同时解决了 延时加载 线程安全的问题,并且代码更加简洁
 * @author spikeCong
 * @date 2022/9/5
 **/
public class Singleton_05 {

    private Singleton_05(){

        // 这地方 正常情况下 没有以下代码是不会加载内部类的，指挥直接的创建一个 Singleton_05 对象
        // 但是 加了 if(SingletonHandler.instance != null)，其中 SingletonHandler.instance != null
        // 就要去加载内部内，然后执行 private static Singleton_05 instance = new Singleton_05();
        // 因此就创建 instance 对象了
        if(SingletonHandler.instance != null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    //创建静态内部类
    private static class SingletonHandler{

        //在静态内部类中创建单例,在装载内部类的时候,才会创建单例对象
        private static Singleton_05 instance = new Singleton_05();
    }


    public static Singleton_05 getInstance(){

        return  SingletonHandler.instance;
    }

}
