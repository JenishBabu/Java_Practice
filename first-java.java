// Java Basic Programs :

// 1.Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}

// 2.Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("hi this message is to welcome "+a);
    }
}

// 3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

