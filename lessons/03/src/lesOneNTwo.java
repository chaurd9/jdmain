import java.util.Scanner;

public class lesOneNTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Имя пользователя: ");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("")) {
            System.out.println("Имя не введено, попробуйте повторно.");
        } else {
            System.out.println("Добро пожаловать, " + name);
        }
    }
}
