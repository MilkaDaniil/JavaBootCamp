package sef.module7.activity;

public class DrivingActivity {
    public static void main(String[] args) {
        Car car = new Car();
        Motocycle motocycle = new Motocycle();
        Driver driver = new Driver("Daniil");

        driver.setDriversMoving(car);
        driver.driversStartsDriving();

        driver.setDriversMoving(motocycle);
        driver.driversStartsDriving();
    }
}