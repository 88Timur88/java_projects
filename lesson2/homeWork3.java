package lesson2;

public class homeWork3 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 1};
        System.out.println("OtvetArray(myArray) = " + otvetArray(myArray));
    }
    /*
     * @apiNote Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * Пример:
     * Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
     * Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
     * Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
     * 
     * @param myArray последовательность чисел
     * 
     * @return Ответ на вопрос: "Возрастающая ли это последовательность?"
     */

    private static String otvetArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return "Yes";
            }
            
        }
        return "No";
    }
}{
    
}
