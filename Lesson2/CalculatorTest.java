import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число: ");

            calculator.setValue1(scanner.nextInt());

            System.out.println("Введите знак математической операции: ");

            calculator.setSign(scanner.next().charAt(0));

            System.out.println("Введите второе число: ");

            calculator.setValue2(scanner.nextInt());

            calculator.calculate();
            while (true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                if (scanner.nextLine().equals("Да")) {
                    continue;
                } else if (scanner.nextLine().equals("Нет")) {
                    break;
                } else {
                    System.out.println("Хотите продолжить? [да/нет]: ");
                }
                break;
            }
        }
    }
}
