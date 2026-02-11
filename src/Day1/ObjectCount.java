class ObjectCount {
    static int count = 0;

    ObjectCount() {
        count++;
    }

    void showCount() {
        System.out.println("Number of objects created = " + count);
    }
}

class ObjectCountDemo {
    public static void main(String[] args) {
        ObjectCount o1 = new ObjectCount();
        ObjectCount o2 = new ObjectCount();
        ObjectCount o3 = new ObjectCount();

        o1.showCount();
    }
}
