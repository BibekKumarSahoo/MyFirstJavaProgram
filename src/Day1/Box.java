package Day1;

import java.util.Scanner;

class Box {
    int length, width, height;

    Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    int volume() {
        return length * width * height;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();

        Box b = new Box(l, w, h);
        System.out.println("Volume of box = " + b.volume());
    }
}
