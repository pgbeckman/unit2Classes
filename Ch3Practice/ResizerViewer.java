import javax.swing.JFrame;

public class ResizerViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ResizerComponent component = new ResizerComponent(frame);
        frame.add(component);
        frame.setVisible(true);
    }
}