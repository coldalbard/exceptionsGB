package seminar.seminar3.task2;

public class MyArrayDataException extends IllegalArgumentException{
    public MyArrayDataException(int i, int j) {
        super("Невозможно преобразовать в строку элемент под индексами: " + i + ", " + j);
    }
}
