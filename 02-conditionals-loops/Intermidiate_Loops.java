// 1.Factorial Program In Java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = 1;
        for (int i=a;i>=1;i--){
            p=p*i;
        }
        System.out.println(p);
    }
}

// 2.Calculate Electricity Bill

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        if(a<100){
            sum=sum+(a*10);
        }
        else if(a>100 && a<200){
            sum=sum+(100*10)+((a-100)*15);
        } else if (a>100 && a<300) {
            sum=sum+(100*10)+(100*15)+((a-200)*20);
        }else if (a>300){
            sum=sum+(100*10)+(100*15)+(100*20)+((a-300)*25);
        }
        System.out.println(sum);
    }
}

// 3.Calculate Average Of N Numbers

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            int a = sc.nextInt();
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
