/**
 * Created by jc260799 on 14/08/17.
 */
import java.util.Scanner;
public class NumberDemo2 {
    public static void main(String args[])
    {
        int a = getNum();
        int b = getNum();
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }
/// test test test test test
    public static int getNum() {
        int num;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = Input.nextInt();
        return num;
    }
    public static void displayTwiceTheNumber(int a)
    {
        System.out.println("The number " + a +
                " is " + (a * 2) + " when Doubled ");
    }
    public static void displayNumberPlusFive(int a)
    {
        System.out.println("The number " +
                a + " is " + (a + 5) + " when 5 is added to it ");
    }
    public static void displayNumberSquared(int a){
        System.out.println("The Number " + a + " is " + (a * a)
                + " when it is Squared.");
    }
}

