import java.util.Scanner;

public class PhoneFormatter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input number: ");
        String num = s.next();
        String first = num.substring(0,3);
        String second = num.substring(3,6);
        String third = num.substring(6,10);
        System.out.println("("+first+") "+second+"-"+third);
    }
}
