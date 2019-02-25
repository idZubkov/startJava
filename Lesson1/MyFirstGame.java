public class MyFirstGame {
  public static void main(String[] args) {
    int compValue = 58;
    int userValue = 58;

    while(compValue != userValue) {
          if (userValue > compValue) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (userValue < compValue) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else {
            System.out.println("Вы угадали!");
        }
    }
  }
}