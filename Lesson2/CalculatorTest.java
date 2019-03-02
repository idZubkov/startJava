import java.util.Scanner;

public class CalculatorTest {    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        calculator.setValue1(scanner.nextInt());
        System.out.println("Введите знак математической операции: ");
        calculator.setSign(scanner.next().charAt(0));
        System.out.println("Введите второе число: ");
        calculator.setValue2(scanner.nextInt());
        calculator.calculation();
    }
}
