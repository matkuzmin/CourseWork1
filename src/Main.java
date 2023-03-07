public class Main {


    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Матвей К", 1, 20000);
        employees[1] = new Employee("Андрей Д", 2, 21000);
        employees[2] = new Employee("Артем В", 3, 22000);
        employees[3] = new Employee("Дмитрий А", 5, 27000);
        employees[4] = new Employee("Виктор А", 2, 29000);
        employees[5] = new Employee("Саша Т", 4, 30000);
        employees[6] = new Employee("Вася Д", 1, 22000);
        employees[7] = new Employee("Татьяна Р", 5, 540000);
        employees[8] = new Employee("Анна П", 3, 50000);
        employees[9] = new Employee("Виктория З", 2, 5000);

        Functions.personPrint(employees);
        Functions.summSalary(employees);
        Functions.minSum(employees);
        Functions.maxSum(employees);
        Functions.averageSum(employees);
        Functions.namePrint(employees);

    }
}