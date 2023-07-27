package loopsPracticalClass;

import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a;
        System.out.println("Enter a Number :");
        n = sc.nextInt();


        while (n > 0) {
            System.out.println(n % 10);
            n = n / 10;
        }
    }
}
