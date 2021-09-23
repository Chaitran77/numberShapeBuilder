package com.company;

import java.util.Scanner;

public class Main {

    public static char getShape(Scanner scanner) {
        System.out.println("Type the shape to generate (t/triangle, d/diamond): \n");
        switch (scanner.next().charAt(0)) {
            case 't':
                return 't';
            case 'd':
                return 'd';
            default:
                System.out.println("Invalid input - try again.");
                getShape(scanner);
        }
        return 'A'; // will never reach this
    }

    public static void generateTriangle(int maxNum) {
        for (int loopDir = 0; loopDir < 2; loopDir++) {
            if ((loopDir%2) == 0) { // check the modulus of loopDir/2 to determine forward or reverse direction
                for (int loop_iter = 1; loop_iter <= maxNum; loop_iter++) {
                    for (int loop_num = 1; loop_num < loop_iter; loop_num++) { // made condition only less than to eliminate one of the max's
                        System.out.print(" " + loop_num); // print out the current number (with a space before it as a separator)
                    }
                    System.out.println();
                }
            } else {
                for (int loop_iter = maxNum; loop_iter >= 0; loop_iter--) {
                    for (int loop_num = 1; loop_num <= loop_iter; loop_num++) {
                        System.out.print(" " + loop_num);
                    }
                    System.out.println();
                }
            }
        }
    }


    public static void generateDiamond(int maxNum) {
        for (int loopDir = 0; loopDir < 2; loopDir++) {
            if ((loopDir%2) == 0) { // check the modulus of loopDir/2 to determine forward or reverse direction
                for (int loop_iter = 1; loop_iter <= maxNum; loop_iter++) {
                    for (int loop_num = 1; loop_num < loop_iter; loop_num++) { // made condition only less than to eliminate one of the max's
                        System.out.print(" " + loop_num); // print out the current number (with a space before it as a separator)
                    }
                    System.out.println();
                }
            } else {
                for (int loop_iter = maxNum; loop_iter >= 0; loop_iter--) {
                    for (int loop_num = 1; loop_num <= loop_iter; loop_num++) {
                        System.out.print(" " + loop_num);
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        char shape = getShape(scanner);

        System.out.println("Type the maximum number: \n");
        int maxNum = scanner.nextInt();



        if (shape == 't') {

            generateTriangle(maxNum);

        } else if (shape == 'd') {
            generateDiamond(maxNum);
        }
    }
}
