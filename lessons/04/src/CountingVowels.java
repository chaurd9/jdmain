import java.util.Scanner;

public class CountingVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, слово или фразу на английском языке: ");
        String str = scanner.nextLine();
        int vowelCount = 0;
        String cleanedStr = str.toLowerCase().trim();

        for (int i = 0; i < cleanedStr.length(); i++) {
            char c = cleanedStr.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
            System.out.println(c);
        }
        System.out.println("Количество гласных: " + vowelCount);
    }
}
