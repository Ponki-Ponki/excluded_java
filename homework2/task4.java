package homework2;

import java.io.IOException;
import java.util.Scanner;

/**
 * task4
 * Разработайте программу, которая выбросит Exception, когда пользователь
 * вводит пустую строку. Пользователю должно показаться сообщение,
 * что пустые строки вводить нельзя.
 */
public class task4 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input something: ");
            isNotEmptyInput2(scan);
        } catch (IOException e) {
            System.out.println("You have a input mistake");
        }
    }

    static void isNotEmptyInput2(Scanner iScanner) throws IOException {
        String str = iScanner.nextLine();
        if (!str.isEmpty()) {
            System.out.println("Its OK");
            iScanner.close();
        } else {
            throw new RuntimeException("Blank strings cannot be entered");
        }

    }
}