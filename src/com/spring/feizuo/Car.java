package com.spring.feizuo;

public class Car {

    private String color;
    private String speed;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void drive(){
        System.out.println("this car color:"+this.color+",speed:"+this.speed);
    }


}
