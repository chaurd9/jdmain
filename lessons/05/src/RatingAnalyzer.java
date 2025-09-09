import java.util.Scanner;
import java.util.Arrays;

public class RatingAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int countstudents = scanner.nextInt();

        while (countstudents < 1) {
            System.out.println("Вы ввели количество студентов меньше 1, попробуйте повторить ввод.");
            countstudents = scanner.nextInt();
        }

        int[] marks = new int[countstudents];
        double avg = 0;
        int maxmark = Integer.MIN_VALUE;
        int minmark = Integer.MAX_VALUE;
        int total = 0;

        for (int i = 0; i < countstudents; i++) {
            System.out.println("Введите оценку студента №" + (i + 1) + " (от 1 до 10): ");
            marks[i] = scanner.nextInt();
            while (marks[i] < 1 || marks[i] > 10) {
                System.out.println("Вы ввели оценку меньше 1 или больше 10, попробуйте повторить ввод.");
                marks[i] = scanner.nextInt();
            }
        }

        Arrays.sort(marks);

        for (double avgmark : marks) {
            avg += avgmark;
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > maxmark) {
                maxmark = marks[i];
            }
            if (marks[i] < minmark) {
                minmark = marks[i];
            }
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > (avg / marks.length))
            total++;
        }

        System.out.println();
        System.out.println("\nРезультаты\n".toUpperCase());
        System.out.println("Средняя оценка: " + avg / marks.length);
        System.out.println("Максимальная оценка: " + maxmark);
        System.out.println("Минимальная оценка: " + minmark);
        System.out.println("Количество студентов с оценкой выше средней: " + total);
        System.out.println("Количество студентов в группе: " + countstudents);
        System.out.print("Оценки в отсортированном виде: ");
        for (int i = 0; i < marks.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(marks[i]);
        }
        System.out.println();
    }
}
