class Bank {

    int balance = 5000;   // Non-static member

    // Static Nested Class
    static class InterestCalculator {

        static double simpleInterest(double p, double r, double t) {
            return (p * r * t) / 100;
        }

        void testAccess() {

        }
    }

    public static void main(String[] args) {

        double si = InterestCalculator.simpleInterest(1000, 5, 2);
        System.out.println("Simple Interest = " + si);
    }
}