import java.util.Scanner;

public class trim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как Вас зовут?");
        String name = scanner.nextLine();

        if (name.trim().equals("")) {
            System.out.println("Вы не ввели Ваше имя?");
        } else {
            System.out.println("Привет, " + name.trim());
        }
    }
}
