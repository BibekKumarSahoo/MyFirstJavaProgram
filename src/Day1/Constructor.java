package Day1;

import java.util.Scanner;

class Constructor {
    int length;
    int breadth;

    // Default constructor
    Constructor() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Constructor(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class ConstructorDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Constructor r1 = new Constructor();
        r1.area();

        // User input
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        // Using parameterized constructor
        Constructor r2 = new Constructor(l, b);
        r2.area();
    }
}
