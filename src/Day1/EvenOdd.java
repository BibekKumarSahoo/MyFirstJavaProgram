class EvenOdd {
    int even = 0, odd = 0;

    EvenOdd(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int n = Integer.parseInt(args[i]);
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
        if (args.length != 10) {
            System.out.println("Enter exactly 10 numbers");
            return;
        }
        EvenOdd eo = new EvenOdd(args);
        eo.display();
    }
}
