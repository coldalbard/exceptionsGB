package seminar.seminar1.task2;

import java.util.Scanner;

public class SecondTask {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {5, 8, 9};
        dialog(arr);
    }
    public static void dialog(int[] arr){
        System.out.printf("Введите искомое число: ");
        int code = sc.nextInt();
        int check = checkArray(arr, code);
        parseCode(check);
    }
    public static int checkArray(int[] arr, int num){
        int minLenght = 5;
        if (arr == null){
            return -3;
        }
        if (arr.length < minLenght){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -2;
    }
    public static void parseCode(int code){
        switch (code){
            case -1:
                System.out.println("Длина массива меньше минимально необходимого");
                break;
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Массив не инециализирован ");
                break;
            default:
                System.out.println("Индекс элемента: " + code);
                break;
        }
    }
}
