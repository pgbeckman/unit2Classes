import java.awt.*;
import javax.swing.JComponent;
import java.awt.geom.*;

/**
 * Component that draws all objects within city
 * 
 * @author Paul Beckman
 * @version Oct 6 2014
 */
public class CityComponent extends JComponent {
    //Keeps track of blimp x position as it is changed by thread
    public static int blimpPos = -450;
    //blimp message
    public String message;
    /**
     * Constructor that adds and starts thread when CityComponenet is instantiated
     * 
     * @param messageIn = String blimp message
     */
    public CityComponent(String messageIn) {
        message = messageIn;
        CityThread threadA = new CityThread();
        threadA.start();
    }
    /**
     * Overwrites JComponenet's paintComponent method to draw all city objects
     * 
     * @pre   requires a JFrame to be instantiated into
     * @post    all objects drawn
     * @param    Graphics g
     * @return   void
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color leaf = new Color(21,209,0);
        Color ground = new Color(196,133,61);
        Color sky = new Color(100,240,240);
        g2.setColor(sky);
        Rectangle2D.Double skyRect = new Rectangle2D.Double(0,0,1500,700);
        g2.fill(skyRect);
        g2.setColor(ground);
        Rectangle2D.Double groundRect = new Rectangle2D.Double(0,600,1500,200);
        g2.fill(groundRect);
        Blimp blimp = new Blimp(blimpPos,10,message);
        blimp.draw(g2);
        Tree tree1 = new Tree(50,400,leaf);
        tree1.draw(g2);
        Tree tree2 = new Tree(200,380,leaf);
        tree2.draw(g2);
        Tree tree3 = new Tree(1200,400,leaf);
        tree3.draw(g2);
        Tree tree4 = new Tree(1300,370,leaf);
        tree4.draw(g2);
        Tree tree5 = new Tree(1000,350,leaf);
        tree5.draw(g2);
        Building building1 = new Building(500,10,3);
        building1.draw(g2);
        Building building2 = new Building(700,8,4);
        building2.draw(g2);
    }
    /**
     * Creates CityThread class that adds to instance variable blimpPos at a given time interval 
     * and repaints CityComponent 
     */
    public class CityThread extends Thread {
        public void run() {
        while (true) {
                try{
                    Thread.sleep(100);
                    blimpPos+=10;
                    repaint();
            } catch (Exception e) {
            }
        }
    }
  }
}