package Projects;

import java.util.Scanner;

public class ArrayExample2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of Array : ");
        int n ;
        n= sc.nextInt();

        int [] arr= new int[n];

        for (int i = 0 ; i<n; i++){
            System.out.print("Enter Numbers in Array : ");
            arr[i]=sc.nextInt();
        }

        for (int i = 0 ; i<n; i++){

            System.out.print( " "+arr[i]);
        }
    }
}
