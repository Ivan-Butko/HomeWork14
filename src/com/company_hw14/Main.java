package com.company_hw14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lengthArray = 1;
        ColorBox[] boxes = new ColorBox[lengthArray];
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = initializationBox();
        }
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("box" + i + ": " + boxes[i].toString());
        }
    }

    private static ColorBox initializationBox() {
        String printingNumText = "Enter a positive non-zero integer: ";
        String printingTextColorLine = "Please select a box color\n" +
                "(1 - \"WHITE\", 2 - \"RED\", 3 - \"ORANGE\", 4 - \"YELLOW\", " +
                "5 - \"GREEN\", 6 - \"BLUE\", 7 - \"VIOLET\"): ";
        String printingTextMaterialLine = "Please select a box material\n" +
                "(1 - \"ANY\", 2 - \"PAPER\", 3 - \"CARDBOARD\", 4 - \"POLYETHYLENE\", 5 - \"PLASTIC\"," +
                " 6 - \"WOOD\", 7 - \"STEEL\")";
        System.out.println("Please enter box height, length, width in cm");
        ColorBox colorBox = new ColorBox(
                scanData(printingNumText), scanData(printingNumText),
                scanData(printingNumText), Material.getMaterialObj(scanData(printingTextMaterialLine)),
                Color.getColorObj(scanData(printingTextColorLine)));
        colorBox.getVolume();
        return colorBox;
    }

    private static int scanData(String printNumText) {
        Scanner scanner = new Scanner(System.in);
        String printingError = "Error. The entered number is not an positive non-zero integer.";
        int temp = 0;
        do {
            try {
                System.out.print(printNumText);
                temp = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println(printingError);
                scanner.next();
            }
            if (temp <= 0) {
                System.out.println(printingError);
            }
        } while (temp <= 0);
        return temp;
    }
}

