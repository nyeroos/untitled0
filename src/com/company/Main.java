package com.company;
import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        double n=scan.nextDouble();
        if (n>=0&&n<100){
            if (n<10){
                System.out.println("DIGIT");
            }
            if (n>9){
                System.out.println("NUM");
            }
        }
        else {
            System.out.println("OTHER");
        }
    }
}
