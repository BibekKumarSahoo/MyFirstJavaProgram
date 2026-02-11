package Day2;

class ObjectCount {
    static int count = 0;

    ObjectCount() {
        count++;
    }

    static void displayCount() {
        System.out.println("Number of objects = " + count);
    }
}

class ObjectCountDemo {
    public static void main(String[] args) {
        ObjectCount o1 = new ObjectCount();
        ObjectCount o2 = new ObjectCount();
        ObjectCount o3 = new ObjectCount();

        ObjectCount.displayCount();
    }
}
