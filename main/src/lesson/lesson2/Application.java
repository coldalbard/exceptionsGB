package lesson.lesson2;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Application {
    public static void main(String[] args) {
////        .NullPointerException
//        String name = null;
//        name.length();

////        .ClassCastException
//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println("file = " + file);

////        .NumberFormatException
//        String str = "123dq";
//        int res = Integer.parseInt(str);
//        System.out.println("res = " + res);

////        .UnsupportedOperationException
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());

//        int num = 1;
//        try {
//            num = 10 / 1;
//            String test = "1";
////            System.out.println("test = " + test.length());
//            Collections.emptyList().add(new Object());
//        } catch (ArithmeticException e) {
//            System.out.println("e.getMessage() = " + e.getMessage());
//        } catch (NullPointerException e) {
//            System.out.println("NullPointer");
//        } catch (Exception e) {
//            System.out.println("exc");
//        }
//        System.out.println("num = " + num);


        FileReader test = null;
        try {
            test = new FileReader("D:\\gb\\exceptions\\main\\src\\lesson\\lesson2\\test.txt");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch excp : " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally");
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("excep close");
                }
            }
        }
    }
}
