package com.company_hw14;

public enum Color {
    W("WHITE", 1),
    R("RED", 2),
    O("ORANGE", 3),
    Y("YELLOW", 4),
    G("GREEN", 5),
    B("BLUE", 6),
    V("VIOLET", 7);

    private String colorName;
    private int colorIndex;

    Color() {
    }

    Color(String colorName) {
        this.colorName = colorName;
    }

    Color(int colorIndex) {
        this.colorIndex = colorIndex;
    }

    Color(String colorName, int colorIndex) {
        this.colorName = colorName;
        this.colorIndex = colorIndex;
    }

    public int getColorIndex() {
        return colorIndex;
    }

    public void setColorIndex(int colorIndex) {
        this.colorIndex = colorIndex;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public static Color getColorObj(int colorIndex) {
        for (Color color : Color.values()) {
            if (color.getColorIndex() == colorIndex) {
                return color;
            }
        }
        return Color.W;
    }
}
