import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int compValue = random.nextInt(100);
        String word;
        do {
            System.out.println("Игра началась!\nИгрок 1 делает ход");
            player1.setNumber(scanner.nextInt());
            if (player1.getNumber() > compValue) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player1.getNumber() < compValue) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
            System.out.println("Игрок 2 делает ход");
            player2.setNumber(scanner.nextInt());
            if (player2.getNumber() > compValue) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (player2.getNumber() < compValue) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
            do {
                word = scanner.nextLine();
                System.out.println("Хотите продолжить? [да/нет]: ");

            } while (!(word.equals("Да") || word.equals("Нет")));

        } while (word.equals("Да"));
    }
}