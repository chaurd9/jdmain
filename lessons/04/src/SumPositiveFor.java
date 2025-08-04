import java.util.Scanner;

public class SumPositiveFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапазона: ");
        int sNumbers = scanner.nextInt();
        System.out.println("Введите конец диапазона: ");
        int eNumbers = scanner.nextInt();

        int sum = 0;

        for (int i = sNumbers; i <= eNumbers; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Результат:");
        System.out.println("Сумма чётных чисел от " + sNumbers + " до " + eNumbers + ": " + sum);
    }
}
