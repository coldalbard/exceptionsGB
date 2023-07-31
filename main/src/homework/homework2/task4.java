package homework.homework2;

import java.util.Scanner;

public class task4 {
    // Разработайте программу, которая выбросит Exception,
    // когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение,
    // что пустые строки вводить нельзя.
    public static void main(String[] args) {
        String text = createNonEmptyString();
        System.out.println("text = " + text);
    }

    private static String createNonEmptyString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пустые строки вводить нельзя!");
        while (true){
            System.out.printf("Введите строку: ");
            String res = sc.nextLine();
            if (!res.isEmpty()) return res;
            else {
                System.out.println("Был ввод пустой строки :(");
            }
        }
    }

}
