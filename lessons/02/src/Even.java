import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Просьба ввести целое число: ");
        int even = scanner.nextInt();

        if (even == 0) {
            System.out.println("Это ноль — особое число");
        } else if (even % 2 == 0) {
            if (even > 0) {
                System.out.println("Четное положительное число");
            } else if (even < 0) {
                System.out.println("Чётное отрицательное число");
            }
        } else {
            if (even > 0) {
                System.out.println("Нечетное положительное число");
            } else if (even < 0) {
                System.out.println("Нечетное отрицательное число");
            }
        }
    }
}