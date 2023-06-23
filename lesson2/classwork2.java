package lesson2;

public class classwork2 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 6, 10 };
        int[] res = runningSum(arr);

        for (int n : res) {
            System.out.println(n + ", ");
        }
        // Задан массив nums. Мы определяем текущую сумму массива как runningSum[i] =
        // sum(nums[0]…nums[i]).
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;

    }

}
