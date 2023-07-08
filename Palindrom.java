import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, rev =0;
        System.out.println("Enter a number :");
        num = sc.nextInt();

        while(num>0){
            int rem = num%10;
            rev =(rev*10) +rem;
            num= num/10;

        }

        if(num==rev){
            System.out.println("Number is not Palindrome");
        }
        else {
            System.out.println("Number is Palindrome");
        }

    }

}
