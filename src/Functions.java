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
            if (arr[i] != null)
                summa = summa + arr[i].getSalary();
            else continue;
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + summa);
        return summa;
    }

    public static void minSum(Employee[] arr) {
        int summ = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (summ > arr[i].getSalary() && arr[i] != null)
                summ = arr[i].getSalary();
            else continue;
        }
        lineSplitting();
        System.out.println("Минимальная зарплата: " + summ);
    }

    public static void maxSum(Employee[] arr) {
        int summ = -1;
        for (int i = 0; i < arr.length; i++) {
            if (summ < arr[i].getSalary() && arr[i] != null)
                summ = arr[i].getSalary();
            else continue;
        }
        lineSplitting();
        System.out.println("Максимальная зарплата: " + summ);
    }

    public static void averageSum(Employee[] arr) {
        float avarage = (float) summSalary(arr) / 12;
        lineSplitting();
        System.out.println("Среднее значение зарплат: " + avarage);

    }

    public static void namePrint(Employee[] arr) {
        lineSplitting();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.println("ФИО сотрудника: " + arr[i].getFullname());
            else continue;
        }
    }

}

