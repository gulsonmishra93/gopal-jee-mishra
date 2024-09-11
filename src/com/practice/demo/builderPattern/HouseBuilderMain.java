package com.practice.demo.builderPattern;

public class HouseBuilderMain
{
public static void  main (String [] args){

HouseBuilder houseBuilder = new HouseBuilder();
House h1 = houseBuilder.setFloor("Floor1").setRoof("Roof1").build();
House h2 = houseBuilder.setFloor("Floor2").setRoof("Roof2").setWalls("walls2").build();

System.out.println(h1);
System.out.println(h2);
}
}
