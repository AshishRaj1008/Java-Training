package com.yash.CarParkingSystem;

public class Car {
    private String regNo;
    private String ownerName;
    private int tokenNo;

    Car(String regNo,String ownerName,int tokenNo){
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.tokenNo = tokenNo;
    }
    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getTokenNo() {
        return tokenNo;
    }
    public void setTokenNo(int tokenNo) {
        this.tokenNo = tokenNo;
    }
}
