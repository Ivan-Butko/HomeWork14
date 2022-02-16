package com.company_hw14;

public class ColorBox extends Box {
    private Color color;
    private String errorText = "Error. Incorrect data entered.";

    public ColorBox() {
    }

    public ColorBox (Color color) {
        this.color = validationColorBox(color);
    }

    public ColorBox(int length, int width, int height, Material material, Color color) {
        super(length, width, height, material);
        this.color = validationColorBox(color);
    }

    public void setColorBox(Color color) {
        this.color = validationColorBox(color);
    }

    public Color getColorBox() {
        return color;
    }

    private Color validationColorBox(Color colorTemp) {
        if (colorTemp.equals(null)) {
            return colorTemp;
        } else {
            throw new IllegalArgumentException(errorText);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " color = " + color.getColorName();
    }
}
