interface Greeting {
    void sayHello();
}

class Welcome implements Greeting {
    public void sayHello() {
        System.out.println("Hello! Welcome to Java Programming 😊");
    }
}

public class GreetingDemo {
    public static void main(String[] args) {
        Greeting g = new Welcome();
        g.sayHello();
    }
}