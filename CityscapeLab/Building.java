import java.awt.*;
import java.awt.geom.*;
import java.util.*;

/**
 * Building class that sets code for draw method
 * 
 * @author Paul Beckman
 * @version Oct 6 2014
 */
public class Building {
    //left x coordinate of tree object
    private int xLeft;
    //number of rows
    private int rowNum;
    //number of columns
    private int columnNum;
    /**
     * Building object constructor
     * 
     * @param
     * xLeftIn = left x coordinate of building object
     * rowNumIn = number of rows
     * columnNumIn = number of columns
     * 
     */
    public Building(int xLeftIn, int rowNumIn, int columnNumIn) {
        xLeft = xLeftIn;
        rowNum = rowNumIn;
        columnNum = columnNumIn;
    }
    /**
     * Creates draw method for building by drawing rectangles with a smaller window rectangles inside
     *
     * @param    xLeft, rowNumIn, columnNumIn
     * @return   void
     */
    public void draw(Graphics2D g2) {
    Color grey = new Color(150,150,150);
    Color yellow = new Color(250,250,150);
    for (int y=0;y<rowNum;y++){
        for (int x=0;x<columnNum;x++){
             g2.setColor(grey);
             Rectangle2D.Double rect1 = new Rectangle2D.Double(xLeft+50*x,600-50*y,50,50);
             g2.fill(rect1);
             g2.setColor(yellow);
             Rectangle2D.Double rect2 = new Rectangle2D.Double(xLeft+50*x+10,610-50*y,30,30);
             g2.fill(rect2);
        }
    }
  }
}
