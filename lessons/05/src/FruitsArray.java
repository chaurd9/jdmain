public class FruitsArray {
    public static void main(String[] args) {
        String[] fruits = {"Яблоко", "Банан", "Киви", "Апельсин", "Груша"};
        System.out.println("Первый фрукт: " + fruits[0]);
        System.out.println("Последний фрукт: " + fruits[fruits.length - 1]);
        System.out.print("Все фрукты: ");
        for (int i = 0; i < fruits.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(fruits[i]);
        }
    }
}