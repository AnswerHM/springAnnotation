package com.humin.bean;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:humin
 * @Date:07/07/20181:50 AM
 */
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
