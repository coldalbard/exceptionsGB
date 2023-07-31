package seminar.seminar2.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class task3 {
//    Запишите в файл следующие строки:
//    Анна=4
//    Елена=5
//    Марина=6
//    Владимир=?
//    Константин=?
//    Иван=4
//    Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
//    (либо HashMap, если студенты с ним знакомы).
//    В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
//    заменить его на соответствующее число.Если на каком-то месте встречается символ,
//    отличный от числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
    public static void main(String[] args) {
        try {
            Map<String, String> map = readFile("D:\\gb\\exceptions\\main\\src\\seminar\\seminar2\\task3\\task3.txt");
            refactorSymbol(map);
            saveToFile("D:\\gb\\exceptions\\main\\src\\seminar\\seminar2\\task3\\save.txt", map);
        } catch (FileNotFoundException e) {
            System.out.println("Прочитать из файла не удалось, возможно неверно указан путь ");
            System.out.println("e.getMessage() = " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Запись в файл не удалась");
            System.out.println("e.getMessage() = " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Неверный формат записи");
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    private static Map<String, String> readFile(String str) throws FileNotFoundException {
        Map<String, String> map = new LinkedHashMap<>();
        File file = new File(str);
        Scanner sc = new Scanner(file);
        while (sc.hasNext()){
            String line = sc.nextLine();
            String[] temp = line.split("=");
            map.put(temp[0], temp[1]);
        }
        sc.close();
        return map;
    }

    private static void refactorSymbol(Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals("?")){
                entry.setValue(String.valueOf(key.length()));
            } else if (!value.matches("[0-9]+")) {
                throw new IllegalArgumentException("Ошибка в строке : " + entry);
            }
        }
    }

    private static void saveToFile(String filePath, Map<String, String> map) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for (Map.Entry<String, String> entry: map.entrySet()){
            writer.write(entry.toString());
            writer.write("\n");
            writer.flush();
        }
        writer.close();
    }
}
