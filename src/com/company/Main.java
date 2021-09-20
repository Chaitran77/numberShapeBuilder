package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int maxNum = scanner.nextInt();
        for (int l = 0; l < 2; l++) {
            if (l == 0) {
                for (int i = 1; i <= maxNum; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            } else {
                for (int r = maxNum; r >= 0; r--) {
                    for (int t = 1; t <= r; t++) {
                        System.out.print(t);
                    }
                    System.out.println();
                }
            }
        }

    }
}
