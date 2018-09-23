package junaid.assign1p;

import java.util.Scanner;

/**
 * Created on 23/09/2018.
 *
 * PROBLEM DEFINATION
 *
 * (PerfectNumber number) A positive integer is called a perfect number if it is equal to
 the sum of all of its positive divisors, excluding itself. For example, 6 is the
 first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1.
 There are four perfect numbers less than 10,000. Write a program to find all
 =======
 the sum of all of its positive divisors, excluding itself. For example, 6 is the first
 perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
 + 1. Check given is perfect and display its proper divisors and their sum .
 */

public class PerfectNumber {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer you want to check:");
        n = s.nextInt();
        System.out.println("Proper Divisors : ");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i+"  ");
                sum = sum + i;
            }
        }
        System.out.print(" : SUM : "+sum);
        System.out.println();
        if (sum == n) {
            System.out.println("Given number is Perfect");
        } else {
            System.out.println("Given number is not Perfect");
        }
    }

}