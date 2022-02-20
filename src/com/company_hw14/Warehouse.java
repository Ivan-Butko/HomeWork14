package com.company_hw14;

import com.company_hw14.exception.EmptyStackException;

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
        checkLengthData();
        data[size++] = element;
    }

    @Override
    public Box pop() {
        if (isEmpty()) {
            throw new EmptyStackException("Warehouse is Empty.");
        }
        checkLengthData();
        return data[size--];
    }

    @Override
    public Box peek() {
        if (isEmpty()) {
            throw new EmptyStackException("Warehouse is Empty.");
        }
        return data[size];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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

    private void checkLengthData() {
        if (size + 1 > lengthData) {
            lengthData *= 2;
            reorganizeData();
        } else if (size - 1 < lengthData) {
            lengthData -= lengthData / 3;
            reorganizeData();
        }
    }

    private void reorganizeData() {
        Box[] temp = new Box[lengthData];
        System.arraycopy(data,0, temp, 0, data.length);
        data = temp;
    }
}
