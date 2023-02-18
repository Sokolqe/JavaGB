import java.util.Arrays;

public class HW1 {
    public static void main(String[] args) {
        System.out.println("isSumBetween:");
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println();

        System.out.println("isPositive:");
        System.out.println(isPositive(5));
        System.out.println(isPositive(-5));
        System.out.println();

        System.out.println("stringRepeat:");
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println("\n");

        System.out.println("isLeapYear:");
        System.out.println(isLeapYear(2020));
        System.out.println();

        System.out.println("createArray:");
        System.out.println(Arrays.toString(createArray(5, 10)));
        System.out.println();

        System.out.println("arraySwap:");
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        intArray(a);
        System.out.println();

        System.out.println("multArray:");
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multArray(b);
        System.out.println();

        System.out.println("minElem and maxElem:");
        int[] c = {5, -4, 9, -5, 0, 10};
        minAndMaxElemOfArray(c);
        System.out.println();

        System.out.println("diagonal:");
        diagonalArray();
        System.out.println();

        System.out.println("prefix:");
        String[] stringArray = {"aaa", "aab", "aa"};
        System.out.println(findCommonPrefix(stringArray));
        String[] strArray = {"abc", "bca", "cda"};
        System.out.println(findCommonPrefix(strArray));
    }

    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if (0 <= a+b && a+b <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i <= repeat; i++) {
            System.out.print(source);
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year %100==0 && year %400 ==0 )
            return true;

        else if (year % 4 == 0 && year % 100 > 0)
            return true;

        else if (year % 100 == 0)
            return false;

        else
            return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initalValue;
        }
        return array;
    }

    private static String findCommonPrefix(String[] source) {
        /** Найти общий префикс среди слов из одного массива.
         * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
         */
        String res = "";
        Boolean sw = true;
        for (int i = 0; i < source[0].length(); i++) {
            for (int j = 0; j < source.length; j++) {
                if (!source[j].startsWith(source[0].substring(0, i))) {
                    sw = false;
                }
            }
            if (sw) {
                res = source[0].substring(0, i);
            }
            else {
                break;
            }
        }
        return res;
    }

    private static void intArray(int[] array) {
        // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }
            else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void multArray(int[] array) {
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void minAndMaxElemOfArray(int[] array) {
        // 4. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.print(min);
        System.out.print(" and ");
        System.out.println(max);
    }

    private static void diagonalArray() {
        // с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(Arrays.toString(array[i]));
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}