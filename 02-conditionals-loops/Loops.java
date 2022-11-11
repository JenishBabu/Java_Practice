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

