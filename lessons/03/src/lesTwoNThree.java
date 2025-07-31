import java.util.Scanner;

public class lesTwoNThree {
    public static void main(String[] args) {
        int attempt = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код доступа: ");
        String code = scanner.nextLine();

        while (attempt > 0 && !code.trim().equalsIgnoreCase("1234")) {
            attempt--;
            if (attempt > 0) {
                System.out.println("Неверный код. Осталось попыток: " + attempt);
                code = scanner.nextLine();
            } else if (attempt == 0) {
                System.out.println("Доступ заблокирован");
            }
        }
        if (code.equalsIgnoreCase("1234")) {
            System.out.println("Доступ разрешён");
        }
    }
}
