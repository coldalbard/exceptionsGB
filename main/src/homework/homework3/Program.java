package homework.homework3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные в таком формате [Фамилия Имя Отчество 11.11.2011 911 (m, f)]: ");
        String user = sc.nextLine();
        String[] curUser = crateUser(user);
        sc.close();
        try {
            checkData(curUser);
            saveFile(user, curUser[0]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    /**
     * @apiNote  Приложение должно проверить введенные данные по количеству
     * @param str  данные
     * @return код ошибки или не ошибки :)
     **/
    private static int amountOfData(String str){
        int currentAmount = 6;
        String[] arr = str.split(" ");
        if (arr.length < currentAmount){
            return 0;
        } else if (arr.length > currentAmount){
            return 2;
        } else return 1;
    }



    /**
     * @apiNote  Приложение должно проверить введенные данные по количеству
     * @param str  данные
     * @return splitting массив данных
     **/
    public static String[] crateUser(String str){
        String[] splitting;
        while (true) {
            int checkAmount = amountOfData(str);
            if (checkAmount == 1) {
                splitting = str.split(" ");
                return splitting;
            } else if (checkAmount == 0) {
                System.out.println("Вы ввели меньше данных, чем требуется");
            } else System.out.println("Вы ввели больше данных чем требуется");
            System.out.printf("Повторите ввод: ");
            str = sc.nextLine();
        }
    }



    /**
     * @apiNote Приложение должно попытаться распарсить полученные значения
     * и выделить из них требуемые параметры.
     * @param arr массив данных
     **/
    public static void checkData(String[] arr){
        String[] fullName = Arrays.asList(arr[0], arr[1], arr[2]).toArray(new String[3]);
        String[] dateBirth = arr[3].split("\\.");
        String phone = arr[4];
        String gender = arr[5];

        for (int i = 0; i < fullName.length; i++) {
            if (fullName[i].matches("[0-9]+") || fullName[i].equals(",.?;:[]{}()")){
                throw new NameException();
            }
        }

        for (int i = 0; i < dateBirth.length; i++) {
            if (dateBirth[i].length() != 2 && i != dateBirth.length - 1){
                throw new DateException();
            } else if (i == dateBirth.length - 1 && dateBirth[i].length() != 4){
                throw new DateException();
            }
        }

        try {
            long cur = Long.parseLong(phone);
        } catch (NumberFormatException e){
            throw new PhoneException();
        }

        if (!gender.equals("f") && !gender.equals("m")){
            throw new GenderException();
        }
    }



    /**
     * @apiNote Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии.
     * @param user данные о пользователе
     * @param path фамилия пользователя
     **/
    public static void saveFile(String user, String path) throws IOException {
        File file = new File("D:\\gb\\exceptions\\main\\src\\homework\\homework3\\" + path + ".txt");
        try (PrintWriter out = new PrintWriter(new FileWriter(file, true))) {
            out.append(user);
            out.append("\n");
        } catch (IOException e) {
            throw new FileSaveException();
        }
    }
}
