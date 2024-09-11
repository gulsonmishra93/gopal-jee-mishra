package com.practice.demo.builderPattern;

public class House{
    String roof;
    String floor;
    String walls;

    public House(String roof, String floor, String walls) {
        this.roof = roof;
        this.floor = floor;
        this.walls = walls;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", floor='" + floor + '\'' +
                ", walls='" + walls + '\'' +
                '}';
    }
}
