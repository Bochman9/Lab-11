import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Example06 {

    public static List<Integer> generateRandomNumbers(int count, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(max - min + 1) + min);
        }
        return numbers;
    }

    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        List<Integer> result = new ArrayList<>();
        if (numbers == null || divisor == 0) {
            return result;
        }
        for (Integer num : numbers) {
            if (num != null && num % divisor == 0) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества чисел
        System.out.print("Введите количество чисел для генерации: ");
        int count = scanner.nextInt();

        // Ввод диапазона чисел
        System.out.print("Введите минимальное значение: ");
        int min = scanner.nextInt();
        System.out.print("Введите максимальное значение: ");
        int max = scanner.nextInt();

        // Генерация случайных чисел
        List<Integer> numbers = generateRandomNumbers(count, min, max);
        System.out.println("Сгенерированные числа: " + numbers);

        // Ввод делителя
        System.out.print("Введите делитель: ");
        int divisor = scanner.nextInt();

        // Фильтрация и вывод результата
        List<Integer> divisibleNumbers = filterDivisibleNumbers(numbers, divisor);
        System.out.println("Числа, делящиеся на " + divisor + " без остатка: " + divisibleNumbers);

        scanner.close();
    }
}
