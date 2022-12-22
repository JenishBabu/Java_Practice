// sum of two numbers

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
    }
    static void sum(int a,int b){
        int c = a+b;
        System.out.println(c);
    }

}
