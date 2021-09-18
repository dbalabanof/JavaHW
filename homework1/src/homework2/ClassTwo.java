package homework2;

public class ClassTwo {
    public static void main(String[] args) {
        // с помощью \n добавляю пустую строку (чтобы разделить результаты разных методов)

        System.out.println(compareSum(21,-1) + "\n"); //для наглядности выводим результат в консоль
        negativeOrPositiveNumber(0);
        System.out.println(reverse(-2) + "\n");
        printing(4,"trololo");
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean compareSum (int a, int b) {
        if (((a + b) >= 10) && (a + b) <= 20) {
            return (true);
        } else {
            return (false);
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void negativeOrPositiveNumber (int c) {
        if (c >= 0) {
            System.out.println("positive \n");
        } else {
            System.out.println("negative \n");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean reverse (int d) {
        if (d >= 0) {       //указал условие d >= 0 по аналогии со 2ым пунктом (хотя в задании это не было оговорено), чтобы 0 не остался неприкаянным
            return (false);
        } else {
            return (true);
        }
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printing (int e, String something) {
        for (int i = 1; i <= e; i++) {
            System.out.println(i + ". " + something);  //на всякий случай вывел номера строк через i (чтобы было удобнее проверять количество строк в результате)
        }
    }
}