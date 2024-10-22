package com.yash.CarParkingSystem;

public class CarParkingDemo {
    public static void main(String[] args) {
        CarParking carParking = new CarParking();

        Car car1 = new Car("1234", "Ashish", 1);
        Car car2 = new Car("4567", "Bhavy", 2);
        Car car3 = new Car("6789", "Santosh", 3);

        carParking.showAvailability();

        carParking.parkCar(car1);
        carParking.parkCar(car2);
        carParking.parkCar(car3);

        carParking.showAvailability();

        Car retrievedCar = carParking.getCar(2);
        if (retrievedCar != null) {
            System.out.println("Retrieved car: " + retrievedCar.getRegNo() + " " + retrievedCar.getOwnerName());
        }

        carParking.showAvailability();
    }
}
