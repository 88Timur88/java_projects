import java.util.Scanner;

public class homework1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringNew = sc.nextLine();
        System.out.println("perevorot(stringNew) = " + perevorot(stringNew));
    }

    /**
     *
     * @param stringNew исходная строка
     * @return перевернутая строка, разделенная пробелом
     * @apiNote Получив входную строку s, измените порядок слов в обратном порядке.Слово определяется как последовательность символов без пробелов. 
     * Слова в s будут разделены по крайней мере одним пробелом.Возвращает строку слов в обратном порядке, объединенную одним пробелом.
     * Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами. 
     * Возвращаемая строка должна содержать только один пробел, разделяющий слова. Не включайте никаких дополнительных пробелов.
     */

    private static String perevorot(String stringNew) {
        String subStr1 = stringNew.substring(0, stringNew.length() / 2);
        String subStr2 = stringNew.substring(stringNew.length() / 2);
        return subStr2 + " " + subStr1;
    }
}
