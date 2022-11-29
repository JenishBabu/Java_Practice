// HCF of two numbers

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<a*b;i++){
            if(a%i==0 && b%i==0){
                c=i;
            }
        }
        System.out.println(c);
    }
}

// LCM

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<a*b;i++){
            if(a%i==0 && b%i==0){
                c=i;
            }
        }
        int lcm = (a*b)/c;
        System.out.println(lcm);
    }
}

// Vowel or consonent

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonent");
        }
    }
}

// Perfect Number

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0;
        for(int i=1;i<a;i++) {
            if (a % i == 0) {
                b = b+i;
            }
        }
            if(a==b){
                System.out.println("Perfect Number");
            }
            else{
                System.out.println("Not a Perfect Number");
            }
    }
}

// Leap Year

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%400==0){
            System.out.println("leap");
        } else if (a%100==0) {
            System.out.println("not leap");
        }else if (a%4==0){
            System.out.println("leap");
        }else{
            System.out.println("not leap");
        }
    }
}

// Sum of digits

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0;
        while(a>0){
            int n = a%10;
            b+=n;
            a=(a/10);
        }
        System.out.println(b);
    }
}

// count of going out in august only in even days 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        for(int i=1;i<=31;i++){
            if(i%2==0){
                c+=1;
            }
        }
        System.out.println(c);

    }
}

/* Write a program to print the sum of negative numbers, sum of positive even numbers 
   and the sum of positive odd numbers from a list of numbers (N) entered by the user. 
   The list terminates when the user enters a zero.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        while( true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            if(n<0){
                a+=n;
            }
            if(n>0 && n%2==0){
                b+=n;
            }
            if(n>0 && n%2!=0){
                c+=n;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
