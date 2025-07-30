import java.util.Scanner;

public class whileFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите верный пароль");
        String pass = scanner.nextLine();

        while (!pass.equals("qwerty")) {
            System.out.println("Введеный пароль неверный, попробуйте повторить попытку.");
            pass = scanner.nextLine();
        }
        System.out.println("Пароль принят.");
    }
}