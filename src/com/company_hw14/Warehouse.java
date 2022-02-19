package com.company_hw14;

import java.util.Arrays;

public class Warehouse implements Stack<Box>{
    private Box[] data;
    private int lengthData;
    private int size = 0;

    public Warehouse() {
        lengthData = 10;
        data = new Box[lengthData];
    }

    public Warehouse(int lengthData) {
        this.lengthData = lengthData;
        data = new Box[this.lengthData];
    }

    @Override
    public void push(Box element) {
        data[size++] = element;
    }

    @Override
    public Box pop() {
        return data[size--];
    }

    @Override
    public Box peek() {
        return data[size];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(data[0]);
        for (int i = 1; i < size; i++) {
            stringBuilder.append(" -> ").append(data[i]);
        }
        return stringBuilder.toString();
    }
}
