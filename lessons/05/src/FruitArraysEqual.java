import java.util.Arrays;

public class FruitArraysEqual {
    public static void main(String[] args) {
        String[] fruits = {"Яблоко", "Банан", "Груша"};
        String[] fruits2 = {"Яблоко", "Груша", "Банан"};

        System.out.println(Arrays.toString(fruits) + "\n" + Arrays.toString(fruits2));

        if (!Arrays.equals(fruits, fruits2)) {
            System.out.println("Разные");
        } else {
            System.out.println("Одинаковые");
        }
    }
}
