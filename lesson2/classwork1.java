package lesson2;

public class classwork1 {
    public static void main(String[] args) {
        // Дан массив целых чисел. Верно ли, что массив является симметричным.
        int [] myArray = {1,2,3,4,5,4,3,2,1};
        System.out.println("palindrom(myArray) = " + polindrom(myArray));
    }
    


    /*
    * 
    */

    private static String polindrom(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            if(array[i]!=array[array.length-i-1]){
                return " Не симметричный! ";
            }
        }
        return " Симметричный ";
    }
}