import java.util.Scanner;

public class IntWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Введите название товара и его цену через запятую: ");
        String str = scanner.nextLine();

        if (str.trim().equals("stop")) {
            System.out.println("Вы ввели команду для остановки программы.");
            return;
        } else {
            String[] parts = str.split(",");

            String name = parts[0].trim();
            double price = Double.parseDouble(parts[1].trim());

            sum = sum + price;

            while (!name.equals("stop")) {
                System.out.println("\nВведите название следующего товара и его цену через запятую: ");
                str = scanner.nextLine();
                if (str.startsWith("stop")) {
                    break;
                }
                parts = str.split(",");
                name = parts[0].trim();
                price = Double.parseDouble(parts[1].trim());

                sum = sum + price;

                System.out.println("\nОбщая сумма ранее названных товаров составляет: " + sum);
            }
        }
    }
}
