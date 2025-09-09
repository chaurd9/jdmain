import java.util.Scanner;

public class Wordcollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько слов вы хотите ввести?");
        System.out.println("Укажите, пожалуйста, целое положительное число: ");
        int countwords = scanner.nextInt();

        while (countwords < 1) {
            System.out.println("Вы ввели недопустимое число, попробуйте ввести Ваше число повторно.");
            countwords = scanner.nextInt();
        }

        String[] array = new String[countwords];

        for (int i = 0; i < countwords; i++) {
            System.out.println("Введите слово №" + (i+1));
            array[i] = scanner.next().trim();
        }

        System.out.println("\nВы задали количество слов: " + countwords);
        System.out.println("И ввели следующие слова:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Слово №" + (i+1) + ": " + array[i]);
        }
    }
}
