import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int attempt = 5;
        int guess = random.nextInt(10) + 1;
        System.out.println("Я загадал число от 0 до 10. Попробуй его отгадать: " + guess);

        int guessUser = scanner.nextInt();

        while (attempt > 0) {
            if (guessUser < guess) {
                attempt--;
                System.out.println("Мало");
                System.out.println("У тебя осталось " + attempt + " попыток.");
            } else if (guessUser > guess) {
                attempt--;
                System.out.println("Много");
                System.out.println("У тебя осталось " + attempt + " попыток.");
            } else {
                break;
            }

            if (attempt > 0) {
                guessUser = scanner.nextInt();
            }
        }
        if (attempt == 0) {
            System.out.println("\nТы проиграл! Я загадал число " + guess);
        } else {
            System.out.println("\nУгадал! Я загадал число " + guess);
        }
    }
}