package com.practice.demo.factorypattern;

public class OperatingSystemFactory {

    public OS getOperatingSystem(String os) {
        if(os.equals("Windows")) {
            return new Windows();
        }
        if(os.equals("Android")) {
            return new Android();
        }
        else
            return new IOS();



    }

}
