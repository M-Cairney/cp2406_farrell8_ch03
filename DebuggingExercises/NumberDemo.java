/**
 * Created by jc260799 on 14/08/17.
 */
public class NumberDemo {

    public static void main(String args[])
    {
        int a = 2, b = 5;
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }
    public static void displayTwiceTheNumber(int a)
    {
        System.out.println("The number" + a +
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
