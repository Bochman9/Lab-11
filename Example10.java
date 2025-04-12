import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод списка чисел
        System.out.println("Введите целые числа через пробел:");
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String numStr : numberStrings) {
            numbers.add(Integer.parseInt(numStr.trim()));
        }

        // Ввод порогового значения
        System.out.print("Введите пороговое значение: ");
        int threshold = scanner.nextInt();

        // Фильтрация и вывод результата
        List<Integer> filtered = filterNumbersLessThan(numbers, threshold);
        System.out.println("Числа меньше " + threshold + ": " + filtered);

        scanner.close();
    }

    public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int threshold) {
        List<Integer> result = new ArrayList<>();
        if (numbers == null) return result;

        for (Integer num : numbers) {
            if (num != null && num < threshold) {
                result.add(num);
            }
        }
        return result;
    }
}