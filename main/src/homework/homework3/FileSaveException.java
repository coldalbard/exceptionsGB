package homework.homework3;

import java.io.IOException;

public class FileSaveException extends IOException {
    public FileSaveException() {
        super("не получилось записать в файл");
    }
}
