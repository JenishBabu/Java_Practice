// Factorial Program In Java

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

// Calculate Electricity Bill

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

// Calculate Average Of N Numbers

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

// Calculate Discount Of Product

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        int a=0;1
        if(p<1000){
            a=0;
        }
        else if(p>=1000 && p<2000){
            a=(p*10)/100;
        } else if (p>=2000 && p<3000) {
            a=(p*20)/100;
        }else {
            a=(p*30)/100;
        }
        System.out.println(p-a);

    }
}

// Calculate Distance Between Two Points

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,x2,y1,y2;
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        double d =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println(d);
    }
}

// Calculate Commission Percentage

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int amount = sc.nextInt();
      int dis_amount = sc.nextInt();
      double d = (dis_amount*100)/amount;
        System.out.println(d);
    }
}

// Power In Java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int p = sc.nextInt();
      int s = 1;
      for(int i=1;i<=p;i++){
          s=s*n;
      }
        System.out.println(s);
    }
}

// Sum Of N Numbers

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int s=0;
        for(int i=1;i<=n;i++){
            int a = sc.nextInt();
            s=s+a;
        }
        System.out.println(s);

    }
}

// Armstrong Number In Java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int s=0;
       int temp = n;
        while(temp>0){
            int u = temp%10;
            temp=(temp/10);
            s = s+(u*u*u);
        }
        if (n==s){
            System.out.println("ArmStrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}

// nCr

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int r = sc.nextInt();
       int a=1,b=1,c=1;
       for(int i=1;i<=n;i++){
           a=a*i;
       }
       for(int j=1;j<=r;j++){
           b=b*j;
       }
       for(int k = 1; k <=(n-r); k++){
           c=c*k;
       }
       double d = a/(b*c);
        System.out.println(d);

    }
}
