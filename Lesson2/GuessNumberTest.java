import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber guessNumber = new GuessNumber();
        System.out.println("Игра началась!");
        System.out.println("Игрок 1 делает ход" );
        player1.setNumber(scanner.nextInt());
        guessNumber.play();

        System.out.println("Игрок 2 делает ход");
        player2.setNumber(scanner.nextInt());
        guessNumber.play();
    }
}