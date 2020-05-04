import java.util.Objects;
import java.util.Scanner;

public class Inscriptions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Start: ");
        String word = input.next();
        for (int i = 0; i < 1000000; i++) {
            String word1 = input.next();
            String word2 = input.next();
            if (word1.equals(word2)) {
                System.out.println("stop");
                break;

            }
        }
    }
}