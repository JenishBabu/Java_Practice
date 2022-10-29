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

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        double P,r;
        P = sc.nextDouble();
        r = sc.nextDouble();
        double A = P*(1+(r/100)*t);
        System.out.println(A);
    }
}

// 4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        char c = sc.next().charAt(0);
        if (c=='+'){
            System.out.println(a+b);
        }
        else if (c=='-'){
            System.out.println(a-b);
        }
        else if (c=='*'){
            System.out.println(a*b);
        }
        else if (c=='/'){
            System.out.println(a/b);
        }
        else{
            System.out.println("Invalid Operator");
        }
    }
}

// 5.Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}

// 6.Input currency in rupees and output in USD.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Indian,US;
        Indian = sc.nextDouble();
        US = 0.012;
        double AfterConversion = Indian*US;
        System.out.println(AfterConversion);
    }
}

// 7.To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,temp;
        a=0;
        b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<n;i++){
            System.out.print(a+b+" ");
            temp = b;
            b=a+b;
            a=temp;
        }

    }
}

// 8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        String b="";
        int len = a.length();
        for (int i=(len-1);i>=0;i--){
            b=b+a.charAt(i);
        }
        if (a.equals(b)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}

// 9. To find Armstrong Number between two given number.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int num=i;
            int sum=0;
            while(num>0){
                int c=num%10;
                num=num/10;
                sum=sum+(c*c*c);
            }
            if(sum==i){
                System.out.println(i+" ");
            }
        }
    }
}

