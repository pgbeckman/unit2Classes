import java.awt.*;
import java.awt.geom.*;

public class Resizer {
    private double diax;
    private double diay;
    public Resizer(double diaxIn, double diayIn) {
        diax = diaxIn;
        diay = diayIn;
    }
    public void draw(Graphics2D g2) {
        Ellipse2D.Double circle1 = new Ellipse2D.Double(0,0,diax,diay);
        g2.draw(circle1);
        g2.fill(circle1);
    }
}
