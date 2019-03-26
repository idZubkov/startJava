import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int compValue = new Random().nextInt(100);
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        while (true) {
            startGame(player1);
            if (player1.getNumber() == compValue) {
                break;
            }
            startGame(player2);
            if (player2.getNumber() == compValue) {
                break;
            }
        }
    }

    public void startGame(Player player) {
        System.out.println(player.getName() + " делает ход");
        player.setNumber(scanner.nextInt());
        if (player.getNumber() > compValue) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (player.getNumber() < compValue) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else {
            System.out.println("Вы угадали!");

        }
    }
}