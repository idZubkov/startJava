public class MyFirstGame {
    public static void main(String[] args) {
        int compValue = 58;
        int userValue = 17;

        while(compValue != userValue) {
            if (userValue > compValue) {
                while (userValue > compValue) {
                    System.out.println("Введенное вами число больше того, что загадал компьютер");
                    userValue--;
                }
            } else {
                while (userValue < compValue) {
                    System.out.println("Введенное вами число меньше того, что загадал компьютер");
                    userValue++;
                }
            }
        }System.out.println("Вы угадали!");
    }
}