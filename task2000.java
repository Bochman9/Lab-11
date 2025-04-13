import java.util.Scanner;

public class task2000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        // Чтение входных данных
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Введите исходный массив");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Введите стартовые позиции  первого игрока и второго игрока");
        int player1Pos = scanner.nextInt() - 1; // Переводим в 0-индексацию
        int player2Pos = scanner.nextInt() - 1;

        // Инициализация счетчиков
        int player1Score = 0;
        int player2Score = 0;

        // Флаги для отслеживания возможности хода
        boolean player1CanMove = true;
        boolean player2CanMove = true;

        // Игровой процесс
        while (player1CanMove || player2CanMove) {
            // Ход первого игрока (двигается вправо)
            if (player1CanMove) {
                if (player1Pos < n) {
                    player1Score += array[player1Pos];
                    player1Pos++;
                } else {
                    player1CanMove = false;
                }
            }

            // Ход второго игрока (двигается влево)
            if (player2CanMove) {
                if (player2Pos >= 0) {
                    player2Score += array[player2Pos];
                    player2Pos--;
                } else {
                    player2CanMove = false;
                }
            }
        }

        // Вывод результата
        System.out.println("Счёт первого - " + player1Score + " " + "Счёт первого - " + player2Score);
    }
}