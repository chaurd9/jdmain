import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String name = scanner.nextLine();

        System.out.println("Сколько тебе лет?");
        String age = scanner.nextLine();

        System.out.println("Привет, " + name + "!" + " Тебе " + age + " лет.");
    }
}