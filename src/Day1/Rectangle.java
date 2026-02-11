import java.util.Scanner;

class Rectangle {
    int length, breadth;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    void calculate() {
        System.out.println("Area = " + (length * breadth));
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }

    void display() {
        calculate();
    }
}

class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.display();
    }
}

