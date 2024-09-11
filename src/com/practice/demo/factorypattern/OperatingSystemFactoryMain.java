package com.practice.demo.factorypattern;

public class OperatingSystemFactoryMain {

    public static void main(String[] args) {
        OperatingSystemFactory fac = new OperatingSystemFactory();
       OS os = fac.getOperatingSystem("IOS");
       os.specs();
    }
}
