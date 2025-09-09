import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class HashmapFruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Просьба указать название фрукта: ");
        String fruit = scanner.nextLine().toLowerCase();

        Map<String, List<String>> dictionaryfruits = new HashMap<>();

        dictionaryfruits.put("apple", Arrays.asList("яблоко", "айва"));
        dictionaryfruits.put("banana", Arrays.asList("банан", "бабалан"));

        if (dictionaryfruits.containsKey(fruit)) {
            System.out.println("Переводы: " + String.join(", ", dictionaryfruits.get(fruit)));
        } else {
            System.out.println("Фрукт не найден в словаре");
        }
    }
}