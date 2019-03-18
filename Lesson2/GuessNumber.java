import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int number;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась!");
        System.out.println("Игрок 1 делает ход");
        player1.setNumber(scanner.nextInt());
        System.out.println("Игрок 2 делает ход");
        player2.setNumber(scanner.nextInt());
        Random random = new Random();
        int compValue = random.nextInt(100);

        while (compValue != number) {
            if (number > compValue) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                break;
            } else if (number < compValue) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                break;
            } else {
                System.out.println("Вы угадали!");
            }
        }
    }
}