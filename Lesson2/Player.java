import java.util.Scanner;

public class Player {
    private String name;
    private int number;
    Scanner scanner = new Scanner(System.in);

    public void setName() {
        this.name = scanner.nextLine();
    }

    public void setNumber() {
        this.number = scanner.nextInt();
    }
}