package Day1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a Number: ");
            int num = sc.nextInt();

            int temp = num, rev = 0;

            while(temp > 0) {
                rev = rev * 10 + temp % 10;
                temp = temp / 10;
            }

            if(num == rev)
                System.out.println(num + " is a Palindrome");
            else
                System.out.println(num + " is NOT a Palindrome");
        }
    }
}
