public class Calculator {
  public static void main(String[] args) {
    int value1 = 5;
    int value2 = 3;
    char sign = 0;

    if (sign == '+') {
        System.out.println(value1 + value2);
        } else if (sign == '-') {
            System.out.println(value1 - value2);
        } else if (sign == '*') {
            System.out.println(value1 * value2);
        } else if (sign == '/') {
            System.out.println(value1 / value2);
        } else if (sign == '^') {
            int power = 0;
            System.out.println(value1 * power);
        } else if (sign == '%') {
            System.out.println(value1 % value2);
        }
    }
}