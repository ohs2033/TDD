package com.naver.tddtest;
public class Elevator {
    private int floor = 0;
    private int targetFloor = 0;
    private boolean isOpen = false;

    public void clickButton(int floor) {
        this.targetFloor = floor;
    }

    public void moveToTarget() {
        this.floor = this.targetFloor;
    }


    public int getFloor () {
        return this.floor;
    }

    public int getTargetFloor() {
        return this.targetFloor;
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }



}
