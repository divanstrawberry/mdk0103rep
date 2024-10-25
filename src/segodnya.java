import java.util.Scanner;

public class segodnya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("сколько время:");
        int time = sc.nextInt();

        if (time > 24) {
            System.out.println("нет");
        } else if (time == 24) {
            System.out.println("добрый вечер!");
        } else if (time >= 18) {
            System.out.println("добрый вечер!");
        } else if (time >= 12) {
            System.out.println("добрый день!");
        } else if (time >= 4) {
            System.out.println("доброе утро!");
        } else if (time >= 0) {
            System.out.println("доброй ночки!");
        } else if (time >= 0) {
            System.out.println("не-а");
        }
    }
}