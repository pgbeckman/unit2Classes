import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

/**
 * Blimp class that sets code for draw method
 * 
 * @author Paul Beckman
 * @version Oct 6 2014
 */
public class Blimp {
  //left x coordinate of blimp object
  private int xLeft;
  //top y coordinate of blimp object
  private int yTop;
  //blimp message
  private String message;
    /**
     * Blimp object constructor
     * 
     * @param
     * xLeftIn = left x coordinate of blimp object
     * yTopIn = top y coordinate of blimp object
     * messageIn = String blimp message
     * 
     */
    public Blimp(int xLeftIn, int yTopIn, String messageIn) {
        xLeft = xLeftIn;
        yTop = yTopIn;
        message = messageIn;
    }
   /**
     * Creates draw method for blimp by filling a large ellipse, drawing strings, and filling a body
     *
     * @param    xLeft, rowNumIn, columnNumIn
     * @return    void
     */
    public void draw(Graphics2D g2) {
    Rectangle2D.Double strings = new Rectangle2D.Double(xLeft+150,yTop+180,100,40);
    g2.setColor(Color.BLACK);
    g2.draw(strings);
    Rectangle2D.Double body = new Rectangle2D.Double(xLeft+150,yTop+210,100,30);
    g2.fill(body);
    Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft, yTop, 400,200);
    g2.setColor(Color.BLUE);
    g2.fill(circle1);
    g2.setFont( new Font("ThisDoesntMatter", Font.PLAIN, 50));
    g2.setColor(Color.YELLOW);
    g2.drawString(message,xLeft+100,yTop+100);
  }
}
