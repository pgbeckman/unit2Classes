import java.util.Scanner;


public class Annuity
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("interest rate: ");
        double i = s.nextDouble();
        System.out.println("number of payments: ");
        double n = s.nextDouble();
        System.out.println("periodic payment: ");
        double PMT = s.nextDouble();
        double PV = PMT*(((Math.pow((1 + i),(n - 1)) - 1) / i )/Math.pow((1 + i),(n - 1)) + 1);
        System.out.println(PV);
    }
}
