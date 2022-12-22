// vote eligibility 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        vote(a);
    }
    static void vote(int a){
        if(a>=18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not eligible for vote");
        }
    }

}
