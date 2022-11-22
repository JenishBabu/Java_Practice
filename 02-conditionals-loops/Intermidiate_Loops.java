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

// 4.Calculate Discount Of Product

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

// 5.Calculate Distance Between Two Points

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

// 6.Calculate Commission Percentage

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

// 7.Power In Java

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
