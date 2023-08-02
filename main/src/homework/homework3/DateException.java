package homework.homework3;

public class DateException extends IllegalArgumentException{
    public DateException() {
        super("Неправильный формат даты");
    }
}
