public class WolfTest extends Wolf {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        sex = "male";
        name = "Oskar";
        weight = 21;
        age = 5;
        colour = "Grey";

        System.out.println(name + " " + sex + " " + weight + " " + age + " " + colour);

        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunting();
    }
}