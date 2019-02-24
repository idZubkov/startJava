public class Calculator {
  public static void main(String[] args) {
        int value1 = 5;
        int value2 = 3;
        char sign = 0;

        char plus = '+';
        char minus = '-';
        char mult = '*';
        char div = '/';
        char power = '^';
        char module = '%';

        if (sign == plus) {
            System.out.println(value1 + value2);
        } else if (sign == minus) {
            System.out.println(value1 - value2);
        } else if (sign == mult) {
            System.out.println(value1 * value2);
        } else if (sign == div) {
            System.out.println(value1 / value2);
        } else if (sign == power) {
            System.out.println(value1 * value1 * value1);
        } else if (sign == module) {
            System.out.println(value1 % value2);
        }
  }
}