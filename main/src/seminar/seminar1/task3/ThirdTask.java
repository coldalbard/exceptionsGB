package seminar.seminar1.task3;

public class ThirdTask {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 1},{0, 1, 0}, {1, 0, 0}};
//        int[][] arr = null;
        try {
            System.out.println("Сумма элементов массива: " + sum2dArr(arr));
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    public static int sum2dArr(int[][] arr){
        if (arr == null){
            throw new RuntimeException("Массив не инициализирован ");
        }
        int sumNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length){
                throw new RuntimeException("Массив не квадратный(");
            }
            for (int j = 0; j < arr[i].length; j++) {
                int item = arr[i][j];
                if (item != 0 && item != 1){
                    throw new RuntimeException("Элемент под индексами " + i + ", " + j +
                            " = " + item + " Ожидается 0 или 1");
                }
                sumNumbers += item;
            }
        }
        return sumNumbers;
    }
}
