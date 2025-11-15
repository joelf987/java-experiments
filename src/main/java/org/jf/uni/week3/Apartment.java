package org.jf.uni.week3;

public class Apartment {
    private int apartNum;
    private int numOfRooms;
    private int numOfBaths;
    private int rent;

    public Apartment(int apartNum, int numOfRooms, int numOfBaths, int rent) {
        this.apartNum = apartNum;
        this.numOfRooms = numOfRooms;
        this.numOfBaths = numOfBaths;
        this.rent = rent;
    }

    public int getApartNum() {
        return apartNum;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public int getNumOfBaths() {
        return numOfBaths;
    }

    public int getRent() {
        return rent;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartNum=" + apartNum +
                ", numOfRooms=" + numOfRooms +
                ", numOfBaths=" + numOfBaths +
                ", rent=" + rent +
                '}';
    }
}
