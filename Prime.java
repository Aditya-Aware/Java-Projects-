package loopsPracticalClass;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a ;
        System.out.println("Enter a number: ");
        a= sc.nextInt();

        for (int i =2; i<a-1;i++){
            if (a%i==0){
                System.out.println("Number is not Prime");
                break;
            }
            else {
                System.out.println("Number is Prime");
                break;
            }
        }
    }
}

