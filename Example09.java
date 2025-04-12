import java.util.ArrayList;
import java.util.List;

public class Example09 {

    private static boolean containsOnlyLetters(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }


    public static List<String> filterLetterOnlyStrings(List<String> strings) {
        List<String> result = new ArrayList<>();
        if (strings == null) {
            return result;
        }
        for (String str : strings) {
            if (containsOnlyLetters(str)) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> testStrings = List.of("Hello", "Java", "Programm1ng", "2025", "Year", "Python", "Ruby");

        List<String> filtered = filterLetterOnlyStrings(testStrings);
        System.out.println("Строки только с буквами: " + filtered);

    }
}
