package homework.homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа
//    (типа float), и возвращает введенное значение.
//    Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) {
        System.out.println("createFloatNumber() = " + createFloatNumber());
    }

    private static float createFloatNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        try {
            return sc.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не дробное число (float)");
            return createFloatNumber();
        }
    }
}
