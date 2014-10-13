import java.util.Scanner;

public class RectangleMaker {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Length: ");
    int length = s.nextInt();
    System.out.print("Width: ");
    int width = s.nextInt();
    int area = length*width;
    int perimeter = (2*length+2*width);
    System.out.println("Area: "+area);
    System.out.println("Perimeter: "+perimeter);
  }
}
