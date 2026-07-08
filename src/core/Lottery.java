package core;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Scanner;

public class Lottery {
    void main(String[] args) {
        Faker fakerName = new Faker(new Locale("ru"));
        String winnerName = fakerName.name().firstName();
        System.out.println(winnerName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String gamerName = scanner.nextLine();

        runGame(winnerName, gamerName);
    }

    public static void runGame(String gamerName, String winnerName){
        for (;;){
            if (!winnerName.equals(gamerName)) {
                System.out.println("Вы не выиграли!");
                break;
            } else {
                System.out.println("Поздравляем! Вы выиграли!");
                break;
            }
        }
    }
}
