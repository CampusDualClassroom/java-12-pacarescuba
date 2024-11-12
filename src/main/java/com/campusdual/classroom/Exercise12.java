package com.campusdual.classroom;

import java.awt.image.PackedColorModel;

public class Exercise12 {
  public static void main(String[] args) {
    //Car fisrtCar = new Car("Renault", "Megane", "Diésel");
    Car fisrtCar = new Car();
    fisrtCar.isTachometerGreaterThanZero();
    fisrtCar.start();
    fisrtCar.start();
    fisrtCar.stop();
    fisrtCar.accelerate();
    fisrtCar.stop();
    fisrtCar.brake();
    fisrtCar.speedometer = 120;
    fisrtCar.accelerate();
    fisrtCar.speedometer = 0;
    fisrtCar.brake();
    fisrtCar.turnAngleOfWheels(20);
    fisrtCar.turnAngleOfWheels(50);
    fisrtCar.brake();
    fisrtCar.setReverse(true);
    fisrtCar.setReverse(false);
    fisrtCar.accelerate();
    fisrtCar.setReverse(true);
  }
}