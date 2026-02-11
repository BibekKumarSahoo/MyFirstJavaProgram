class University {

    String universityName = "KIIT";
    String location = "Bhubaneswar";

    // Inner Class
    class Department {
        String deptName = "CSE";
        String hodName = "Dr. Kumar";

        void display() {
            System.out.println("University Name: " + universityName);
            System.out.println("Location: " + location);
            System.out.println("Department Name: " + deptName);
            System.out.println("HOD Name: " + hodName);
        }
    }

    public static void main(String[] args) {

        University u = new University();           // Outer class object
        University.Department d = u.new Department();   // Inner class object
        d.display();
    }
}