package lesson2;


public class classwork5 {
    public static void main(String[] args) {
        int[] arrNum = { 4, 2, 5, 8, 4, 9, 3, 4, 2 };
        System.out.println(countElem(arrNum));
    }

    /*
     * @apiNote Даннмассив целых чисел. Нацти количество пар соседних элементов, где первый элемент вдвое больше второгою
     * @param arr массив целых чисел.
     * @return countN результат вычисления
     * 
     */
    
    public static int countElem(int[] arr) {
        int countN = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 2 * arr[i]) {
                countN += 1;
            }
        }
        return countN;
    }
}
