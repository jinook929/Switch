package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was neither 1 nor 2");
        }

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("switchValue was 1");
                break;

            case 2:
                System.out.println("switchValue was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("switchValue was either 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("switchValue was neither 1, 2, 3, 4 nor 5");
                break;
        }
    }
}
