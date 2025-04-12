
import java.util.List;
import java.util.stream.Collectors;

public class Example03 {
    public static void main(String[] args) {

        String string = "Напишите функцию, которая Принимает на вход список строк и" +
                "возвращает новый список, Содержащий только те строки, которые" +
                "начинаются с Большой Буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n"+ "Строка псоле сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterCapitulitedStrings(strings);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterCapitulitedStrings(List<String> list) {
    return list.stream()
            .filter(s -> Character.isUpperCase(s.charAt(0)))
            .collect(Collectors.toList());
    }

}
