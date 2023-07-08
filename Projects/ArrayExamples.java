package Projects;

import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n;
        System.out.println("Enter Array Size: ");
        n = kb.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i <n ; i ++){
            System.out.println("Enter Number :" );
            arr[i]=kb.nextInt();
        }
        int sum = 0;

        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
            sum = sum +arr[i];

        }
        System.out.println("Sum is = " +sum);
        System.out.println("Average is = "+ (float)sum/n);



    }
}
