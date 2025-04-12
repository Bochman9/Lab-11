import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод списка строк
        System.out.println("Введите строки через запятую:");
        String input = scanner.nextLine();
        String[] inputStrings = input.split(",");
        List<String> strings = new ArrayList<>();

        for (String str : inputStrings) {
            strings.add(str.trim());
        }

        // Ввод минимальной длины
        System.out.print("Введите минимальную длину строки: ");
        int minLength = scanner.nextInt();

        // Фильтрация и вывод результата
        List<String> filtered = filterStringsByLength(strings, minLength);
        System.out.println("Строки длиннее " + minLength + " символов: " + filtered);

        scanner.close();
    }

    public static List<String> filterStringsByLength(List<String> strings, int minLength) {
        List<String> result = new ArrayList<>();
        if (strings == null) return result;

        for (String str : strings) {
            if (str != null && str.length() > minLength) {
                result.add(str);
            }
        }
        return result;
    }
}
