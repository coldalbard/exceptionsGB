package seminar.seminar3.task2;

public class Program {
//    Напишите метод, на вход которого подаётся двумерный строковый массив
//    размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//    Далее метод должен пройтись по всем элементам массива,
//    преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось
//    (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//    MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//    В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
//    и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            int r = sumOfElements(arr);
            System.out.println("r = " + r);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }
    public static int sumOfElements(String[][] arr){
        int res = 0;
        int currentSizeOfMatrix = 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != currentSizeOfMatrix || arr[i].length != currentSizeOfMatrix){
                throw new MyArraySizeException("Это не матрица 4x4");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    res += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
//                if (arr[i][j].matches("[0-9]+")){
//                    res += Integer.parseInt(arr[i][j]);
//                } else {
//                    throw new MyArrayDataException("")
//                }
            }
        }
        return res;
    }
}
