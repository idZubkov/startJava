import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    String word;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Игра началась!");
            System.out.println("Игрок 1 делает ход");
            player1.setNumber(scanner.nextInt());
            System.out.println("Игрок 2 делает ход");
            player2.setNumber(scanner.nextInt());
            Random random = new Random();
            int compValue = random.nextInt(100);

            while (player1.getNumber() != compValue) {
                if (player1.getNumber() > compValue) {
                    System.out.println("Введенное первым игроком число больше того, что загадал компьютер");
                    break;
                } else if (player1.getNumber() < compValue) {
                    System.out.println("Введенное первым игроком число меньше того, что загадал компьютер");
                    break;
                } else {
                    System.out.println("Первый игрок угадал!");
                }
            }
            while (player2.getNumber() != compValue) {
                if (player2.getNumber() > compValue) {
                    System.out.println("Введенное вторым игроком число больше того, что загадал компьютер");
                    break;
                } else if (player2.getNumber() < compValue) {
                    System.out.println("Введенное вторым игроком число меньше того, что загадал компьютер");
                    break;
                } else {
                    System.out.println("Второй игрок угадал!");
                }
            }
            scanner.nextLine();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                word = scanner.nextLine();
            } while (!(word.equals("Да") || word.equals("Нет")));
        } while (word.equals("Да"));
    }
}