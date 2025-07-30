import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько тебе лет?");
        int age = scanner.nextInt();

        if (age < 0 || age > 130) {
            System.out.println("Некорректный возраст!");
        } else {
            if (age < 18) {
                System.out.println("Ты ещё ребёнок.");
            } else {
                System.out.println("Добро пожаловать во взрослую жизнь.");
            }
        }

    }
}