package lesson2;

import java.util.ArrayList;
import java.util.List;

public class homeWork1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 6, 10 };
        int[] res = sumNum(arr);

        for (int n : res) {
            System.out.println(n + ", ");
        }
        /*
         * @aoiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
         * @param arr Последовательность чисел
         * @return res суммацелыхчисел последовательности
         */
    }

    /**
     * @param nums
     * @return
     */
    public static int[] sumNum(int[] nums) {
        List<Integer> newArr = new ArrayList<Integer>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == 0 & nums[i] % 3 == 0 & nums[i] % 5 == 0 & nums[i] % 7 == 0)
            newArr.add(nums[i]);
        }

    }
    

        public static int newArray(int[] newArr) {
        int res = 0;
        for (int i = 1; i < newArr.length; i++) {
            
            res = res + newArr[i];
        }
        return res;

    }

}