import java.util.Scanner;
import java.util.Arrays;

public class FruitPurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько фруктов Вы хотите купить (целое число n)?");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.println("Введено неверное значение, попробуйте повторно.");
            n = scanner.nextInt();
        }
        scanner.nextLine();

        String[] fruits = new String[n];
        double[] prices = new double[n];
        double total = 0;
        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;
        String maxFruit = "";
        String minFruit = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Введите название фрукта №" + (i + 1) + ": ");
            fruits[i] = scanner.nextLine();

            System.out.print("Введите цену для " + fruits[i] + ": ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine();

            total += prices[i];
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                maxFruit = fruits[i];
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
                minFruit = fruits[i];
            }
        }

        double avg = total / n;
        System.out.println("\nСписок продуктов: ");
        for (int i = 0; i < n; i++) {
            System.out.println(fruits[i] + " - " + prices[i]);
        }

        System.out.println("Общая стоимость продуктов: " + total);
        System.out.println("Средняя стоимость продуктов: " + avg);
        System.out.println("Самый дорогой продукт: " + maxFruit + " (" + maxPrice + ")");
        System.out.println("Самый дешевый продукт: " + minFruit + " (" + minPrice + ")");
    }
}
