package loopsPracticalClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,a;
        System.out.println("Enter a number : ");
        n= sc.nextInt();
        a=n;
            while(n>10){
                n /= 10;
            }
        System.out.println("First Number "+n);
        System.out.println("Last Number :"+a%10);
    }
}
