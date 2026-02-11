package Day2;

import java.util.Scanner;

class EvenOdd {
    int even = 0, odd = 0;

    EvenOdd(int[] arr) {
        for (int n : arr) {
            if (n % 2 == 0)
                even++;
            else
                odd++;
        }
    }

    void display() {
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
}

class EvenOddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        EvenOdd eo = new EvenOdd(arr);
        eo.display();
    }
}