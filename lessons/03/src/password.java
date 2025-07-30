import java.util.Scanner;

public class password {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        int attempt = 3;

        while (attempt > 0 && !pass.equals("qwerty")) {
            attempt--;
            System.out.println("Пароль неверный, у вас осталось " + attempt + " попыток");
            pass = scanner.nextLine();
        }
        if (attempt == 0) {
            System.out.println("Доступ запрещен!");
        } else {
            System.out.println("Пароль принят!");
        }
    }
}