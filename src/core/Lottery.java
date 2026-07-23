package core;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Faker fakerName = new Faker(new Locale("ru"));
        String winnerName = fakerName.name().firstName();
        System.out.println(winnerName);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String gamerName = scanner.nextLine();
        scanner.close();

        runGame(gamerName, winnerName);
    }

    public static void runGame(String gamerName, String winnerName) {
        if (!winnerName.equals(gamerName)) {
            System.out.println("Вы не выиграли!");
            } else {
            System.out.println("Поздравляем! Вы выиграли!");
        }
    }
}
