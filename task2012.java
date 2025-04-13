import java.util.Scanner;

public class task2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int remaining = 12 - f;
        if (60 + remaining * 45 <= 300) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
