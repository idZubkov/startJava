import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String word;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя первого игрока: ");
            Player player1 = new Player(scanner.nextLine());

            System.out.println("Введите имя второго игрока: ");
            Player player2 = new Player(scanner.nextLine());

            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.play();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                word = scanner.nextLine();
            } while (!(word.equals("Да") || word.equals("Нет")));
        } while (word.equals("Да"));
    }

}
