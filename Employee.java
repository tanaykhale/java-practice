class Employee {
    private int eid;
    private String name;
    private double salary;

    Employee() {
        eid = 100;
        name = "Raj";
        salary = 100000;
    }

    Employee(int id, String n, double s) {
        eid = id;
        name = n;
        salary = s;
    }

    public void display() {
        System.out.println("Employee id->" + eid);
        System.out.println("Employee name->" + name);
        System.out.println("Employee salary->" + salary);
    }

    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee();
        arr[1] = new Employee(123, "tanay", 123443);
        arr[2] = new Employee();
        arr[3] = new Employee(543, "Raj", 6543);
        arr[4] = new Employee();
        for (int i = 0; i < arr.length; i++)
            arr[i].display();
    }

}