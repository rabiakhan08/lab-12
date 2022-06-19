import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, ans;
        Scanner obj = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            num1 = obj.nextInt();
            System.out.print("Enter second number: ");
            num2 = obj.nextInt();
            ans = num1/num2;
            System.out.println(num1+"/"+num2+" = "+ans);
        }
        catch (ArithmeticException e){
            System.out.println("cannot divide number by zero");
        }
        catch (InputMismatchException e){
            System.out.println("Input is invalid, please give integer number");
        }
        finally {
            System.out.println("End");
        }
    }
}
