package com.company_hw14;

public class Box {
    private int length;
    private int width;
    private int height;
    private int volume;

    private Material material;
    private String errorText = "Error. The number cannot be negative or equal to zero.";

    public Box() {
    }

    public Box(int length, int width, int height) {
        this.length = validationDigit(length);
        this.width = validationDigit(width);
        this.height = validationDigit(height);
    }

    public Box(int length, int width, int height, Material material) {
        this(length, width, height);
        this.material = validationMaterial(material);
    }

    public void setLength(int length) {
        this.length = validationDigit(length);
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = validationDigit(width);
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = validationDigit(height);
    }

    public int getHeight() {
        return height;
    }

    public void setMaterial(Material material) {
        this.material = validationMaterial(material);
    }

    public Material getMaterial() {
        return material;
    }

    public double getVolume() {
        return volume = length * width * height;
    }

    private int validationDigit(int number) {
        if (number > 0) {
            return number;
        } else {
            throw new IllegalArgumentException(errorText);
        }
    }

    private Material validationMaterial(Material materialTemp) {
        if (materialTemp.equals(null)) {
            return materialTemp;
        } else {
            throw new IllegalArgumentException(errorText);
        }
    }

    @Override
    public String toString() {
        return "length = " + length +
                " cm   width = " + width +
                " cm   height = " + height +
                " cm   volume = " + volume +
                " cbcm   material = " + material.getMaterialName();
    }
}
