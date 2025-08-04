import java.util.Scanner;

public class MultiplicationNFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10: ");
        int Number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int Multipl = Number*i;
            System.out.println(Number + " x " + i + " = " + Multipl);
        }
        System.out.println("Умножение завершено.");
    }
}