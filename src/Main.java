import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите цену:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int price = sc.nextInt();
            if (price > 0) {
                System.out.println("Миль к начислению: " + price / 20);
            } else {
                System.out.println("Цена не может быть отрицательной!");
            }
        } else {
            System.out.println("Это не число. Попробуйте снова");
        }
        /*
        int price = 15_000;
        System.out.println(price / 20);
        */
    }
}
