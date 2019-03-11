import java.util.Random;

public class GuessNumber {
    Random random = new Random();
    int compValue = random.nextInt(100);
    int setNumber = Player.setName();

    public void play() {
        while (compValue != setNumber) {
            if (setNumber > compValue) {
                while (setNumber > compValue) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                }
            } else {
                while (setNumber < compValue) {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                }
            }
        }
        System.out.println("Вы угадали!");
    }
}