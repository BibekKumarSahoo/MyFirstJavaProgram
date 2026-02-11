import java.util.Scanner;
import Marketing.Sales;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        Sales s = new Sales(id, name, basic);

        double total = s.earnings() + s.tallowance();

        System.out.println("The emp id of the employee is " + s.getEmpId());
        System.out.println("The total earning is " + total);
    }
}