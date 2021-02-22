package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void hello() {

        System.out.print("May I have your name? ");

        StringBuilder name = new StringBuilder();

        try (Scanner sc = new Scanner(System.in)) {

            name.append(sc.nextLine());

        } catch (Exception e) {
        }

        System.out.println("Hello, " + name + "!");
    }
}
