package homework.homework2;

import java.util.Scanner;

public class task4 {
    // Разработайте программу, которая выбросит Exception,
    // когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение,
    // что пустые строки вводить нельзя.
    public static void main(String[] args) {
        try {
            String text = createNonEmptyString();
            System.out.println("text = " + text);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    private static String createNonEmptyString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пустые строки вводить нельзя!");
        System.out.printf("Введите строку: ");
        String res = sc.nextLine();
        if (!res.isEmpty()) return res;
        else throw new RuntimeException("Ввод был пустой :(");
    }

}
