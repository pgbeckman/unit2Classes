import java.util.Scanner;

public class StringParser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input number: ");
        String num = s.next();
        String end = num.substring(num.length()-3);
        String begin = num.substring(0,num.length()-4);
        System.out.println(begin+end);
    }
}
