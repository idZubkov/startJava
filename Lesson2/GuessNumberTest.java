public class GuessNumberTest {
    public static void main(String[] args) {
        Player player1 = new Player();
        System.out.println("Введите имя первого игрока: ");
        player1.setName();
        Player player2 = new Player();
        System.out.println("Введите имя второго игрока: ");
        player2.setName();
        GuessNumber guessNumber = new GuessNumber();
        System.out.println("Игра началась!");
        guessNumber.play();
    }
}