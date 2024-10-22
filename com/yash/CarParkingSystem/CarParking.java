package com.yash.CarParkingSystem;

public class CarParking
{
    private int parkingSpots[][];
    private int capacity[];

    public CarParking() {
        this.capacity = new int[]{5, 4, 3, 2, 1};
        this.parkingSpots = new int[5][];
        for (int i = 0; i < 5; i++) {
            parkingSpots[i] = new int[capacity[i]];
            for (int j = 0; j < capacity[i]; j++) {
                parkingSpots[i][j] = -1; // Initialize empty spots
            }
        }
    }

    public void showAvailability() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Floor " + (i + 1) + ":");
            for (int j = 0; j < capacity[i]; j++) {
                if (parkingSpots[i][j] == -1) {
                    System.out.print("Empty ");
                } else {
                    System.out.print("Occupied ");
                }
            }
            System.out.println();
        }
    }

    public boolean parkCar(Car car) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < capacity[i]; j++) {
                if (parkingSpots[i][j] == -1) {
                    parkingSpots[i][j] = car.getTokenNo();
                    System.out.println("Car parked on floor " + (i + 1) + " spot " + (j + 1));
                    return true;
                }
            }
        }
        System.out.println("No available spots. Car cannot be parked.");
        return false;
    }

    public Car getCar(int tokenNo) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < capacity[i]; j++) {
                if (parkingSpots[i][j] == tokenNo) {
                    Car car = new Car("", "", tokenNo);
                    parkingSpots[i][j] = -1;
                    System.out.println("Car retrieved from floor " + (i + 1) + " spot " + (j + 1));
                    return car;
                }
            }
        }
        System.out.println("No car found with token number " + tokenNo);
        return null;
    }
}

