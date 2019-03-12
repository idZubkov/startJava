import java.util.Random;

public class GuessNumber {

    public void play() {
        Random random = new Random();
        int compValue = random.nextInt(100);
        int number = 0;
        while (compValue != number) {
            if (number > compValue) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                break;
            } else if (number < compValue){
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                break;
            }
            else {
                System.out.println("Вы угадали!");
            }
        }

    }
}