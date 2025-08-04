import java.util.Scanner;

public class lesOneNTwoNThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 3;
        String name = "Bob";
        System.out.println("Добрый день! Пожалуйста, введите Ваш пароль: ");
        int pass = scanner.nextInt();

        while (attempt > 0) {
            if (pass == 1234) {
                System.out.println("Добро пожаловать, " + name + "!");
                break;
            } else if (pass != 1234) {
                attempt--;
                if (attempt == 0) {
                    System.out.println("Пароль неверный, попробуйте в следующий раз.");
                    System.out.println("Доступ заблокирован.");
                } else {
                    System.out.println("Пароль неверный, попробуйте повторную попытку. Осталось " + attempt + " попыток.");
                    pass = scanner.nextInt();
                }
            }
        }
    }
}