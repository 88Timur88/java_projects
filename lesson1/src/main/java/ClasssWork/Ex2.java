package ClasssWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num1 = sc.nextInt();

        for (int i = 0; i < n; i++){
            int num2 = sc.nextInt();

            if(isNumberPositive(num1, num2)){
                count++;
            }
            num1 = num2;
        }

        System.out.println("Count = " + count);
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел,
     * после которых следует отрицательное число.
     * @param N входящее целочисленное число
     * @return результат выполнения задания
     */
    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}
