package com.naver.tddtest;
public class Elevator {
    private int floor = 0;
    private int targetFloor = 0;
    private boolean isOpen = false;

    public void clickButton(int floor) {
        this.setTargetFloor(floor);
    }

    public void moveToTarget() throws Exception {
        if (this.isOpen) {
            throw new Exception("Elevator door is still open.");
        }
        this.setFloor(this.getTargetFloor());
        this.setIsOpen(true);
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

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
        new java.util.Timer().schedule(
            new java.util.TimerTask() {
                @Override
                public void run() {
                    setIsOpen(false);
                }
            },
            500
        );
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setTargetFloor(int floor) {
        this.targetFloor = floor;
    }


}
