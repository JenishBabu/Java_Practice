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
