import java.awt.*;
import javax.swing.*;

class Panel extends JPanel {
    Panel(){
        this.setPreferredSize(new Dimension(400, 400));
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int x = 0;
        int y = 0;

        g2d.setPaint(new Color(0, 0, 0));
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                g2d.fillRect(x, y, 50, 50);
                x = 100*j;
            }
            y=50*i;
        }
        //g2d.setPaint(new Color(255, 255, 255));
        //g2d.fillRect(50,0,50,50);
    }
}