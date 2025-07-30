import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите, пожалуйста, оценку от 1 до 5: ");
        int rating = scanner.nextInt();

        if (rating == 5) {
            System.out.println("Отлично");
        } else if (rating == 4) {
            System.out.println("Хорошо");
        } else if (rating == 3) {
            System.out.println("Удовлетворительно");
        } else if (rating == 2) {
            System.out.println("Плохо");
        } else if (rating == 1) {
            System.out.println("Очень плохо");
        } else {
            System.out.println("Некорректная оценка!");
        }
    }
}
