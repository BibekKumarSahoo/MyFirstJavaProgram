package Day1;

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            String roll = sc.nextLine();

            System.out.print("Enter Section: ");
            String section = sc.nextLine();

            System.out.print("Enter Branch: ");
            String branch = sc.nextLine();

            System.out.println("\n--- Student Details ---");
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + roll);
            System.out.println("Section: " + section);
            System.out.println("Branch: " + branch);
        }

    }
}
