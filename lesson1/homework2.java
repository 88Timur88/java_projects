import java.util.Scanner;

/**
 * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
 * @param Spisok последовательность целых чисел
 * @return Сумма положительнвх чисел, после которых следует отрицательное число
 */
public class homework2 {
    public static void main(String[] args) {
        Scanner Spisok = new Scanner(System.in);
        int n = Spisok.nextInt();
        int sum = 0;
        int num1 = Spisok.nextInt();
        for (int i = 0; i < n; i++){
            int num2 = Spisok.nextInt();
            if(isNumberPositive(num1, num2)){
                sum = sum + num1;
            }
            num1 = num2;
        }
        System.out.println("sum = " + sum);
    }
    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}