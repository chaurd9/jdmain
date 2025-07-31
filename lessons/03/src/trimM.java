import java.util.Scanner;

public class trimM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, название города: ");

        String nameTown = scanner.nextLine();
        if (nameTown.trim().equals("")) {
            System.out.println("Пожалуйста, введите название города.");
        } else if (nameTown.trim().equalsIgnoreCase("stop")) {
            System.out.println("Программа остановлена пользователем.");
        } else if (nameTown.trim().length() < 3) {
            System.out.println("Название слишком короткое, попробуйте ещё раз.");
        } else {
            System.out.println("Вы ввели город: " + nameTown.trim());
        }
    }
}