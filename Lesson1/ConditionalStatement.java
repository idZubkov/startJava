public class ConditionalStatement {
    public static void main(String[] args) {
        int age;
        boolean isMale = true;
        double height;
        String name = "Ivan";
        char firstChar;

        if ((age = 21) > 20) {
            System.out.println("Your age is over 20 years");
        }

        if (isMale) {
            System.out.println("You are male");
        }

        if (!isMale) {
            System.out.println("You are female");
        }

        if ((height = 1.82) < 1.80) {
            System.out.println("You are not above 1.80");

        } else {
            System.out.println("You are above 1.80");
        }

        if ((firstChar = name.charAt(0)) == 'M') {
            System.out.println("First char in your name 'M'");

        } else if ((firstChar = name.charAt(0)) == 'I') {
            System.out.println("First char in your name 'I'");

        } else {
            System.out.println("First char in your name not 'M' and not 'I'");
        }
    }
} 