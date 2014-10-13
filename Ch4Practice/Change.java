import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Amount Due: ");
        int due = s.nextInt();
        System.out.println("Amount Received: ");
        int received = s.nextInt();
        int change = received-due;
        System.out.println("Quarters: "+(int)(change/25));
        int remaining = change%25;
        System.out.println("Dimes: "+(int)(remaining/10));
        remaining = change%10;
        System.out.println("Nickels: "+(int)(remaining/5));
        remaining = change%5;
        System.out.println("Pennies: "+(int)(remaining));
    }
}
