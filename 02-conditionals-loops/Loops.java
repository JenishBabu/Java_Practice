// 21.Fibonacci Series In Java Programs

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=0;
        b=1;
        int n = sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=2;i<=n;i++){
            int k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;
        }
    }
}

// 22.Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s=0;
        int p=1;
        while(a>0){
            int n = a%10;
            s=s+n;
            p=p*n;
            a=a/10;

        }
        System.out.println(p-s);

    }
}

// 23.Input a number and print all the factors of that number 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
    }
}

// 24.Take integer inputs till the user enters 0 and print the sum of all numbers 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0;
        int n;
        while((n=sc.nextInt())>0){
            if(n!=0){
                s=s+n;
            }
        }
        System.out.print(s);
    }
}

// 25.
