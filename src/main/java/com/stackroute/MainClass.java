package com.stackroute;

public class MainClass {
    public static void main(String[] args) {

        ToyCar car = new ToyCar();
        ToyPlane plane = new ToyPlane();
        ToyTrain train = new ToyTrain();

        train.setColor("Blue");
        train.setPrice(500.0);

        car.setColor("Red");
        car.setPrice(200.0);

        plane.setColor("White");
        plane.setPrice(300.0);

        System.out.println("----------------Toys---------------");
        System.out.println();

        car.canMove();
        System.out.println("The color of car toy is: "+car.getColor());
        System.out.println("The price of car toy is: "+car.getPrice());
        System.out.println();

        train.canMove();
        System.out.println("The color of train toy is: "+train.getColor());
        System.out.println("The price of train toy is: "+train.getPrice());
        System.out.println();

        plane.canMove();
        plane.canFly();
        System.out.println("The color of plane toy is: "+plane.getColor());
        System.out.println("The price of plane toy is: "+plane.getPrice());
        System.out.println();


    }

}
