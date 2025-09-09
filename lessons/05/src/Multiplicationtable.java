import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10: ");
        int number = scanner.nextInt();
        if (number < 1 || number > 10) {
            System.out.println("Вы ввели число, которое не входит в диапазон от 1 до 10.");
        } else {
            System.out.println("Вы ввели число: " + number);

            for (int i = 1; i < 11; i++) {
                int result = number*i;
                System.out.println(number + " x " + i + " = " + result);
            }
        }
    }
}