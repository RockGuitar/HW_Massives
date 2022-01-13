package ru.skypro;

public class Main {

    public static void main ( String[] args ) {
        //Задание 1
        int[] arrayOne = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        double[] arrayTwo = {1.57, 7.654, 9.986};

        long[] arrayThree = new long[]{249, 978655, 12315, 150, 1};

        //Задание 2
        System.out.println(arrayOne[0] + "," + arrayOne[1] + "," + arrayOne[2]);
        System.out.println(arrayTwo[0] + "," + arrayTwo[1] + "," + arrayTwo[2]);
        System.out.println(arrayThree[0] + "," + arrayThree[1] + "," + arrayThree[2] + ","
                + arrayThree[3] + "," + arrayThree[4] + "\n");

        //Задание 3
        System.out.println(arrayOne[2] + "," + arrayOne[1] + "," + arrayOne[0]);
        System.out.println(arrayTwo[2] + "," + arrayTwo[1] + "," + arrayTwo[0]);
        System.out.println(arrayThree[4] + "," + arrayThree[3] + "," + arrayThree[2] + ","
                + arrayThree[1] + "," + arrayThree[0] + "\n");
        //Задание 4
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] += 1;
            }
            System.out.println(arrayOne[i]);
        }
    }
}

