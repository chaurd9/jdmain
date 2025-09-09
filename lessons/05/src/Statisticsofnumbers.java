import java.util.Scanner;
import java.util.Random;

public class Statisticsofnumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Сколько чисел Вы хотите видеть (целое положительное)? ");
        int n = scanner.nextInt();

        while (n < 1) {
            System.out.println("Вы ввели число: " + n);
            System.out.println("Данное число является неверным, попробуйте ввести повторно.");
            n = scanner.nextInt();
        }

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int randomnumbers = random.nextInt(1, 11);
            array[i] = randomnumbers;
        }

        System.out.println("\nВы ввели число: " + n);
        System.out.print("Все числа из массива: ");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
             sum = sum + array[i];
        }
        System.out.println("Сумма всех чисел из массива равна " + sum);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Мин.число: " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Макс.число: " + max);

        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println("Количество четных чисел: " + even);
    }
}
