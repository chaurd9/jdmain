import java.util.Arrays;

public class FruitsArrayImport {
    public static void main(String[] args) {
        String[] fruits = {"Яблоко", "Банан", "Киви", "Апельсин", "Груша"};
        System.out.println(Arrays.toString(fruits));
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        int index = Arrays.binarySearch(fruits, "Киви");
        System.out.println("Киви находится на позиции № " + index);
        String[] arr = new String[3];
        Arrays.fill(arr, "Фрукт");
        System.out.println(Arrays.toString(arr));
    }
}