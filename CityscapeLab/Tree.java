import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

/**
 * Tree class that sets code for draw method
 * 
 * @author Paul Beckman
 * @version Oct 6 2014
 */
 public class Tree {
    //left x coordinate of tree object
     private int xLeft;
    //top y coordinate of tree object
    private int yTop;
    //leaf color
    Color treeColor = null;
    /**
     * Tree object constructor
     * 
     * @param
     * xLeftIn = left x coordinate of tree object
     * yTopIn = top y coordinate of tree object
     * treeColorIn = leaf color
     * 
     */
    public Tree(int xLeftIn, int yTopIn, Color treeColorIn) {
        xLeft = xLeftIn;
        yTop = yTopIn;
        treeColor = treeColorIn;
    }
    /**
     * Creates draw method for tree by randomly drawing ellipses and one trunk
     *
     * @param    xLeft, yTop, treeColor
     * @return    void
     */
    public void draw(Graphics2D g2) {
    Rectangle2D.Double rect1 = new Rectangle2D.Double(xLeft+50,yTop+50,30,200);
    Color brown = new Color(144,62,0);
    g2.setColor(brown);
    g2.fill(rect1);
    Random jenny = new Random();
        for (int x=0;x<20;x++){
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft+jenny.nextInt(80), yTop+jenny.nextInt(80), 50+jenny.nextInt(30), 50+jenny.nextInt(30));
        g2.setColor(treeColor);
        g2.fill(circle1);
    }
  }
}
