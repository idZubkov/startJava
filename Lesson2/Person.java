public class Person {
    public static void main(String[] args) {
        String sex = "male";
        String name = "John";
        double height = 1.78;
        int weight = 75;
        int age = 26;
    }
    void move () {
        System.out.println("Человек идёт");
    }
    boolean run () {
        System.out.println("Человек бежит");
        return true;
    }
    void sit () {
        System.out.println("Человек сидит");
    }
    String speak () {
        return "Some text";
    }
    void learnJava () {
        System.out.println("Человек учит Java");
    }
}