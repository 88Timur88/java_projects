package lesson2;

public class homeWork2 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 1};
        System.out.println("OtvetArray(myArray) = " + otvetArray(myArray));
    }
    /*
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что
     * последовательность является возрастающей.
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
}
