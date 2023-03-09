public class Functions {
    public static void lineSplitting() {
        System.out.println("=======================");
    }

    public static void personPrint(Employee[] arr) {
        lineSplitting();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.println(arr[i]);
            else continue;
        }
        lineSplitting();
    }

    public static int summSalary(Employee[] arr) {
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                summa = summa + arr[i].getSalary();
            } else continue;
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + summa);
        lineSplitting();
        return summa;

    }

    public static void findMinSalary(Employee[] arr) {
        int summ = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (summ > arr[i].getSalary() && arr[i] != null)
                summ = arr[i].getSalary();
            else continue;
        }
        System.out.println("Минимальная зарплата: " + summ);
        lineSplitting();
    }

    public static void findMaxSum(Employee[] arr) {
        int summ = -1;
        for (int i = 0; i < arr.length; i++) {
            if (summ < arr[i].getSalary() && arr[i] != null)
                summ = arr[i].getSalary();
            else continue;
        }
        System.out.println("Максимальная зарплата: " + summ);
        lineSplitting();
    }

    public static void averageSum(Employee[] arr) {
        int summa = 0;
        int person = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                summa = summa + arr[i].getSalary();
                person++;
                float avarage = summa / person;
                System.out.println("Среднее значение зарплат: " + avarage);
                lineSplitting();
            }
        }
    }

    public static void namePrint(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.println("ФИО сотрудника: " + arr[i].getFullname());
            else continue;
        }
        lineSplitting();
    }

    public static void indexSalary(Employee[] arr, float index) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                arr[i].setSalary((int) (arr[i].getSalary() * index));
            }
        }
        lineSplitting();
    }

    public static void departMinSalary(Employee[] arr, int dep) {
        int summ = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && summ > arr[i].getSalary() && arr[i].getDepartment() == dep)
                summ = arr[i].getSalary();
            else continue;
        }
        System.out.println("Минимальная зарплата в отделе" + dep + " cоставляет: " + summ + " руб");
        lineSplitting();
    }

    public static void departMaxSalary(Employee[] arr, int dep) {
        int summ = -1;
        for (int i = 0; i < arr.length; i++) {
            if (summ < arr[i].getSalary() && arr[i] != null && arr[i].getDepartment() == dep)
                summ = arr[i].getSalary();
            else continue;
        }
        System.out.println("Максимальная зарплата в отделе " + dep + " cоставляет: " + summ + " руб");
        lineSplitting();
    }

    public static void departSummSalary(Employee[] arr, int dep) {
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getDepartment() == dep)
                summa = summa + arr[i].getSalary();
            else continue;
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + summa);
        lineSplitting();
    }

    public static void departAverageSum(Employee[] arr, int dep) {
        int a = 0;
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == dep)
                summ = summ + arr[i].getSalary();
            a++;
        }
        float avarage = (float) summ / a;
        System.out.println("Среднее значение зарплат по отделу " + dep + " составили: " + avarage);
        lineSplitting();
    }

    public static void departIndexSalary(Employee[] arr, float index, int dep) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getDepartment() == dep) {
                arr[i].setSalary((int) (arr[i].getSalary() * index));
            } else continue;
        }
        lineSplitting();
    }

    public static void derartPersonPrint(Employee[] arr, int dep) {
        System.out.println("Список сотрудников отдела № " + dep);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getDepartment() == dep)
                System.out.println(arr[i].getId() + " " + arr[i].getFullname() + " " + arr[i].getSalary());
            else continue;
        }
        lineSplitting();
    }

    public static void lessSalary(Employee[] arr, int num) {
        System.out.println("Список сотрудников с зарплатой меньше" + num);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getSalary() < num)
                System.out.println(arr[i].getId() + " " + arr[i].getFullname() + " " + arr[i].getSalary());
            else continue;
        }
        lineSplitting();
    }

    public static void moreSalary(Employee[] arr, int num) {
        System.out.println("Список сотрудников с зарплатой больше" + num);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].getSalary() > num)
                System.out.println(arr[i].getId() + " " + arr[i].getFullname() + " " + arr[i].getSalary());
            else continue;
        }
        lineSplitting();
    }
}



