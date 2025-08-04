import java.util.Scanner;

public class GuessthePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String str = scanner.nextLine();

        String ok = "java";
        String cleanStr = str.trim().toLowerCase();
        int found = 0;

        for (int i = 0; i < ok.length(); i++) {
            char c = ok.charAt(i);
            if (cleanStr.contains(String.valueOf(c))) {
                System.out.println("Буква " + c + " найдена!");
                found++;
            }
        }
        if (found == 0) {
            System.out.println("К сожалению, совпадений не найдено.");
        } else {
            System.out.println("Количество совпадений: " + found);
        }
    }
}
