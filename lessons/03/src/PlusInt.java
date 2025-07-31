import java.util.Scanner;

public class PlusInt {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введите, пожалуйста, число для сложения: ");
        int input = scanner.nextInt();

        sum = sum + input;
        System.out.println(sum);
        while (input != 0) {
            System.out.println("Введите, пожалуйста, следующее число: ");
            input = scanner.nextInt();
            sum = sum + input;
            System.out.println(sum);
        }
    }
}