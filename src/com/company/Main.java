package com.company;

import com.company.CarBasics;

public class Main {

    public static void main(String[] args) {
        // the basic structure
        CarBasics car= new CarBasics();
        car.color="green";
        car.number="789";
        car.engine="54444cc";
        car.door="3";

        System.out.println(car.color);

    }
}
