package seminar.seminar1.task1;

public class FirstTask {
    /**
     * @apiNote Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
     * Если длина массива меньше некоторого заданного минимума, метод возращает -1,
     * в качестве кода ошибки, иначе длину массива
     * */
    public static void main(String[] args) {
        int[] arr = {6, 3, 9};
        System.out.println(checkLenght(arr));
    }
    public static int checkLenght(int[] arr){
        int minLenght = 5;
        if (arr.length < minLenght) return -1;
        return arr.length;
    }
}
