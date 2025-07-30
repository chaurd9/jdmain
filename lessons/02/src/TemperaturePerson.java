import java.util.Scanner;

public class TemperaturePerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру: ");
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println("На улице мороз!");
        } else if (temperature >= 0 && temperature <= 20) {
            System.out.println("Прохладно.");
        } else if (temperature >= 21 && temperature <= 30) {
            System.out.println("Тепло.");
        } else {
            System.out.println("Очень жарко!");
        }
    }
}