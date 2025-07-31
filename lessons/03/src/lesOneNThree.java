import java.util.Scanner;

public class lesOneNThree {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int Number = scanner.nextInt();

        while (Number < 1 || Number > 5) {
            System.out.println("Введите число от 1 до 5");
            Number = scanner.nextInt();
        }
    }
}