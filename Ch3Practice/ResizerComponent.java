import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class ResizerComponent extends JComponent {
    public JFrame bob;
    public ResizerComponent(JFrame frameIn) {
        bob = frameIn;
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Resizer resizer1 = new Resizer(bob.getWidth()-15,bob.getHeight()-35);
        resizer1.draw(g2);
    }
}