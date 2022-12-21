// min and max of three numbers 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        max(a,b,c);
        min(a,b,c);

    }
    static void max(int a,int b,int c){
        int s=a;
        if (b>s){
            s=b;
        }
        else if (c>s){
            s=c;
        }
        System.out.println(s);
    }

    static void min(int a,int b,int c){
        int m=a;
        if (b<m){
            m=b;
        }
        else if (c<m){
            m=c;
        }
        System.out.println(m);
    }

}
