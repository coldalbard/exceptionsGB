package homework.homework3;

public class PhoneException extends NumberFormatException {
    public PhoneException() {
        super("Данные о телефоне записаны неккоректно");
    }
}
