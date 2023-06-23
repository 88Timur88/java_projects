package lesson2;

import java.util.Scanner;

public class classwork4 {
    public static void main(String[] args) {
        // 2) Дана последовательность из N целых чисел. Найти сумму чисел,
        // оканчивающихся на 5, перед которыми идет четное число.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNumbers(n, sc));

    }
    /*
     * @apiNote Дана последовательность из N целых чисел. Найти сумму чисел,
     * оканчивающихся на 5, перед которыми идет четное число.
     * @param number-количество чисел
     * @param in сканер
     * @return smNum результатвычисления
     */

    public static int sumNumbers(int number, Scanner in) {
        int smNum = 0;
        int firstNum = in.nextInt();
        for (int i = 0; i < number - 1; i++) {
            int num = in.nextInt();
            if (firstNum % 2 == 0 && num % 10 == 5) {
                smNum += num;
            }
        }
        return smNum;
    }
}
