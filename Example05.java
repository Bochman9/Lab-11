import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example05 {

    public static List<String> filterStringsContainingSubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();

        if (strings == null || substring == null) {
            return result;
        }
        for (String str : strings) {
            if (str != null && str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод списка строк
        System.out.println("Введите строки (для завершения введите 'end'):");
        List<String> inputList = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            }
            inputList.add(line);
        }

        // Ввод подстроки для поиска
        System.out.print("Введите подстроку для поиска: ");
        String substring = scanner.nextLine();

        // Фильтрация и вывод результата
        List<String> filteredList = filterStringsContainingSubstring(inputList, substring);
        System.out.println("Строки, содержащие подстроку '" + substring + "':");
        System.out.println(filteredList);

        scanner.close();
    }
}