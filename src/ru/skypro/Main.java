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
        for (int x = 0; x < arrayOne.length; x++) {
            if (x == arrayOne.length - 1) {
                System.out.print(arrayOne[x] + "\n");
                break;
            }
            System.out.print(arrayOne[x] + ", ");
        }

        for (int y = 0; y < arrayTwo.length; y++) {
            if (y == arrayTwo.length - 1) {
                System.out.print(arrayTwo[y] + "\n");
                break;
            }
            System.out.print(arrayTwo[y] + ", ");
        }
        for (int z = 0; z < arrayThree.length; z++) {
            if (z == arrayThree.length - 1) {
                System.out.print(arrayThree[z] + "\n");
                break;
            }
            System.out.print(arrayThree[z] + ", ");
        }


        //Задание 3
        for (int x = arrayOne.length - 1; x > -1; x--) {
            if (x == 0) {
                System.out.print(arrayOne[x] + "\n");
                break;
            }
            System.out.print(arrayOne[x] + ", ");
        }
        for (int y = arrayTwo.length - 1; y > -1; y--) {
            if (y == 0) {
                System.out.print(arrayTwo[y] + "\n");
                break;
            }
            System.out.print(arrayTwo[y] + ", ");
        }
        for (int z = arrayThree.length - 1; z > -1; z--) {
            if (z == 0) {
                System.out.print(arrayThree[z] + "\n");
                break;
            }
            System.out.print(arrayThree[z] + ", ");
        }
        //Задание 4
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] += 1;
            }
            System.out.println(arrayOne[i]);
        }
    }
}

