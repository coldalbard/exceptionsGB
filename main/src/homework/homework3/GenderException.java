package homework.homework3;

public class GenderException extends IllegalArgumentException {

    public GenderException() {
        super("Неправильно указан гендер");
    }
}
