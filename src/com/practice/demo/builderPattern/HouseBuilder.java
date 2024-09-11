package com.practice.demo.builderPattern;

public class HouseBuilder {
    String roof;
    String floor;
    String walls;


    public HouseBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public HouseBuilder setFloor(String floor) {
        this.floor = floor;
        return this;
    }

    public HouseBuilder setWalls(String walls) {
        this.walls = walls;
        return this;
    }

    public House build() {
        return new House(roof, floor, walls);

    }


}
