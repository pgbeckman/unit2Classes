import java.awt.*;
import java.awt.geom.*;

public class Target {
    private int xLeft;
    private int yTop;
    private int numOfRings;
    public Target(int xLeftIn, int yTopIn, int numOfRingsIn) {
        xLeft = xLeftIn;
        yTop = yTopIn;
        numOfRings = numOfRingsIn;
    }
    public void draw(Graphics2D g2) {
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft, yTop, 100, 100);
        g2.draw(circle1);
        g2.fill(circle1);
        
        Ellipse2D.Double circle2 = new Ellipse2D.Double(xLeft+10, yTop+10, 80, 80);
        g2.draw(circle2);
        g2.setColor(Color.WHITE);
        g2.fill(circle2);
        
        Ellipse2D.Double circle3 = new Ellipse2D.Double(xLeft+20, yTop+20, 60, 60);
        g2.draw(circle3);
        g2.setColor(Color.BLACK);
        g2.fill(circle3);
        
        Ellipse2D.Double circle4 = new Ellipse2D.Double(xLeft+30, yTop+30, 40, 40);
        g2.draw(circle4);
        g2.setColor(Color.WHITE);
        g2.fill(circle4);
        
        Ellipse2D.Double circle5 = new Ellipse2D.Double(xLeft+40, yTop+40, 20, 20);
        g2.draw(circle5);
        g2.setColor(Color.BLACK);
        g2.fill(circle5);
    }
}
