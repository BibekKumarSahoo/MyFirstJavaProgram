import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("CGPA: ");
        cgpa = sc.nextFloat();
    }

    void display() {
        System.out.println(roll + " " + name + " " + cgpa);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].read();
            if (s[i].cgpa < s[minIndex].cgpa)
                minIndex = i;
        }

        System.out.println("Student with lowest CGPA:");
        s[minIndex].display();
    }
}
