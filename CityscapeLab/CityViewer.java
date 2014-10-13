import javax.swing.JFrame;
import java.util.*;

/**
 * Viewer for CityComponent
 * 
 * @author Paul Beckman
 * @version Oct 6 2014
 */
public class CityViewer{
    public static String message;
    /**
     * Takes in user string for blimp method, passes into CityComponent object
     * Creates JFrame and instantiates CityComponent object
     */
    public static void main(String[] args) {
        System.out.println("Message for Blimp: ");
        Scanner s = new Scanner(System.in);
        message = s.next();
        
        JFrame frame = new JFrame();
        frame.setSize(1500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CityComponent component = new CityComponent(message);
        frame.add(component);
        frame.setVisible(true);
    }
}