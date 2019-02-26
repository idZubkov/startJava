public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int i = 6;
        while (i > -7) {
            System.out.println(i);
            i -= 2;
        }

        int x = 10;
        int result = 0;
        do {
            if (x % 2 == 0) {
                result += x;        
            }
            x++;
        } while (x < 21);
        System.out.println(result);   
    }
}