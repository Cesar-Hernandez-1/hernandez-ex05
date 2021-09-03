/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*  Pseudocode:
 *  Delicaire scanner input object to receive input from user
 *  Ask user for first number and store input in "str1" string variable
 *  Ask user for second number and store input in "str2" string variable
 *  Convert "str1" and str2" into integers and store in "num1" and "num2" integer variables respectively
 *  Compute addition, subtraction, multiplication, and division of two numbers respectively and store results in
 *      respective int variables named "add", "sub", "mul", and "div" respectively
 *  Use printf() to display computations and work for each case on a separate line and format to use actual user entered
 *      variables
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

        int add = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;

        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d%n", num1,num2,add,num1,num2,sub,num1,num2,mul,num1,num2,div);

    }
}
