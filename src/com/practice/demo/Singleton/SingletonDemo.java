package com.practice.demo.Singleton;

public class SingletonDemo {
   private static SingletonDemo instance ;
   private String s;
    private SingletonDemo() {
       s  = "hello this is singleton demo";
    }
    private synchronized static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo x = SingletonDemo.getInstance();
        SingletonDemo y = SingletonDemo.getInstance();
        SingletonDemo z = SingletonDemo.getInstance();
        System.out.println("HashCode of x===="+x.hashCode());
        System.out.println("HashCode of y===="+y.hashCode());
        System.out.println("HashCode of z===="+z.hashCode());


    }
}
