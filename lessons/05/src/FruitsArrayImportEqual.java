import java.util.Arrays;

public class FruitsArrayImportEqual {
    public static void main(String[] args) {
        String[] fruits = {"Яблоко", "Банан", "Киви", "Апельсин", "Груша", "Гранат"};
        System.out.println(Arrays.toString(fruits));
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        int index = Arrays.binarySearch(fruits, "Апельсин");
        System.out.println("Апельсин находится на позиции № " + index);
        String arr[] = new String[4];
        Arrays.fill(arr, "Фрукт");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.equals(arr, fruits));
    }
}
