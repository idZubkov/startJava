public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
        boolean isMale = true;
        double height = 1.82;
        String name = "Инокентий";
        char firstChar = name.charAt(0);

        if (age > 20) {
            System.out.println("Ваш возраст больше 20");
        }

        if (isMale) {
            System.out.println("Вы мужского пола");
        }

        if (isMale == false) {
            System.out.println("Вы женского рода");
        }

        if (height < 1.80) {
            System.out.println("Вы ниже 1.80");
        } else {
            System.out.println("Вы выше 1.80");
        }

        if (firstChar == 'М') {
            System.out.println("Ваше имя начинается с буквы 'М'");
        } else if (firstChar == 'И') {
            System.out.println("Ваше имя начинается с буквы 'И'");
        } else {
            System.out.println("Ваше имя начинается не на 'М' и не на 'И'");
        }
    }
}