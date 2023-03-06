public class Employee {
    private static int count = 1;
    private int id = count;
    private String fullname;
    private int department;
    private int salary;

    public Employee(String fullname, int department, int salary) {
        this.id = count++;
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        System.out.print("ID: ");
        return id;
    }

    public String getFullname() {
        return this.fullname;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", department=" + department +
                ", salary=" + salary;
    }
}
