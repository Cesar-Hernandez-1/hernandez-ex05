/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*  Pseudocode:
 *  Delicaire scanner input object to receive input from user
 *  Ask user for first number and store input in "str1" string variable
 *  Ask user for second number and store input in "str2" string variable
 *  Convert "str1" and str2" into integers
 *  Store input type conversions in "num1" and "num2" integer variables respectively
 *  Compute addition, subtraction, multiplication, and division of two numbers respectively and convert and store
 *      results in respective String variables named "add", "sub", "mul", and "div" respectively
 *  Use printf() to display results and work for each case on a separate line
 *
 */
package exercise05;
import java.util.Scanner;
public class Solution05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String str1 = input.nextLine();

        System.out.print("What is the second number? ");
        String str2 = input.nextLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        String add = String.valueOf(num1+num2);
        String sub = String.valueOf(num1-num2);
        String mul = String.valueOf(num1*num2);
        String div = String.valueOf(num1/num2);

        System.out.printf("%s + %s = %s%n%s - %s = %s%n%s * %s = %s%n%s / %s = %s%n", str1,str2,add,str1,str2,sub,str1,str2,mul,str1,str2,div);

    }
}
