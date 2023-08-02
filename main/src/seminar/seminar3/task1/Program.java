package seminar.seminar3.task1;

public class Program {
    public static void main(String[] args) {
        try {
            double res = division(6, 0);
            System.out.println("res = " + res);
        } catch (DivisionByZeroException e){
            e.printStackTrace();
        }

    }
    public static double division(int num1, int num2){
        if (num2 == 0) throw new DivisionByZeroException("Деление на ноль(");
        return num1 / num2;
    }
}
