package lesson.lesson1;

import java.io.File;

public class Application {
    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("D:\\gb\\exceptions\\main\\src\\lesson\\lesson1\\filetxt.txt")));
        System.out.println(divide(10, 0));
//        a();
    }
    public static long getFileSize(File file){
        if (!file.exists()){
            return -1;
        }
        return file.length();
    }
    public static int divide(int a1, int a2){
        if (a2 == 0){
            throw new RuntimeException("на ноль делить нельзя");
        }
        return a1 / a2;
    }
    public static void a(){
        b();
    }
    public static void b() {
        c();
    }
    public static void c(){
        int[] arr = new int[10];
        System.out.println(arr[11]);
    }
}
