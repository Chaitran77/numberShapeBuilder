package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the maximum number: \n");

        int maxNum = scanner.nextInt();
        int loop_iter;
        int loop_num;

        for (int loopDir = 0; loopDir < 2; loopDir++) {
            if ((loopDir%2) == 0) { // check the modulus of loopDir/2 to determine forward or reverse direction
                for (loop_iter = 1; loop_iter <= maxNum; loop_iter++) {
                    for (loop_num = 1; loop_num < loop_iter; loop_num++) { // made condition only less than to eliminate one of the max's
                        System.out.print(" " + loop_num); // print out the current number (with a space before it as a separator)
                    }
                    System.out.println();
                }
            } else {
                for (loop_iter = maxNum; loop_iter >= 0; loop_iter--) {
                    for (loop_num = 1; loop_num <= loop_iter; loop_num++) {
                        System.out.print(" " + loop_num);
                    }
                    System.out.println();
                }
            }
        }

    }
}
