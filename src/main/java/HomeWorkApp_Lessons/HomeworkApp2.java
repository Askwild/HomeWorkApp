package HomeWorkApp_Lessons;

public class HomeworkApp2 {
    public static void main(String[] args) {
        // chekSum(10, 50);
        System.out.println(finalSum(-100, 20));
        guessAmount(-0);
        System.out.println(guessSum(-1));
        stringAndNumber(10);
        isLeapYearBool();
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10
// до 20 (включительно), если да – вернуть true, в противном случае – false.
    // 1 - вариант
    public static void chekSum(int first, int second) {
        int sum = first + second;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    // 2 - вариант
    public static boolean finalSum(int sum1, int sum2) {
        int totalSum = sum1 + sum2;
        if (totalSum >= 10 && totalSum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void guessAmount(int sum) {
        if (sum >= 0) {
            System.out.println("Число " + sum + " положительное");
        } else {
            System.out.println("Число " + sum + " отрицательное");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean guessSum(int amountSum) {
        if (amountSum >= 0) {
            return false;
        } else {
        }
        return true;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void stringAndNumber(int numberAlmaty) {
        for (int i = 0; i < numberAlmaty; i++) {
            System.out.println(i + " Almaty");
        }
    }

    //5. * Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void isLeapYearBool() {
        int g = 400;
        if (g % 4 == 0) {
            if ((g % 100 != 0) || (g % 400 == 0)) {
                System.out.println("true");
            }
        } else {
            System.out.println("false");
        }
    }
}


