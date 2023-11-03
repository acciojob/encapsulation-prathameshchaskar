package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // name has private access in com.driver.RWOnly
        // so we have to use getter and setter to access the variable
        obj.setName("prathamesh");

        System.out.println(obj.getName());

    }
}