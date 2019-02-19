public class ConditionalStatement {
	public static void main(String[] args) {
		int age;
		String sex;
		double height;
		String name;

		if (age > 20) {
    		System.out.println("Ваш возраст больше 20");
}

		if (sex.equals("male")) {
    		System.out.println("Вы мужского пола");
}

		if (sex.equals("female")) {
    		System.out.println("Вы женского рода");
}

		if (height < 1.80) {
    		System.out.println("Вы ниже 1.80");
		} else {
    		System.out.println("Вы выше 1.80");
}

		if (name.charAt(0) == 'М') {
    		System.out.println("Ваше имя начинается с буквы 'М'");
		} else if (name.charAt(0) == 'И') {
    		System.out.println("Ваше имя начинается с буквы 'И'");
		} else {
    		System.out.println("Ваше имя начинается не на 'М' и не на 'И'");
} 
	}
}