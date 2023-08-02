package homework.homework3;

public class NameException extends IllegalArgumentException{
    public NameException() {
        super("Неверно указан формат ФИО");
    }
}
