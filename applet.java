import java.applet.*;
import java.awt.*;
// this is applet code to create 4 cncentric circles (7th code in applet topic of linked refrence site)
import javax.swing.JApplet;
// we linked this java code to applet.html file here in same repository , to acess this code run applet.html file code on chrome browser with installing CHEERPI APP-
//-LET RUNNER CHROME EXTENSION AND EXECUTTING IT .  
public class applet extends JApplet{
   public void paint(Graphics g) {
      //at first used but more better design i improved it to next .
      //g.drawOval(10, 10, 100, 100);
      //g.drawOval(20, 20, 80, 80);
      //g.drawOval(30, 30, 60, 60);
      //g.drawOval(40, 40, 40, 40);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        
        int radius1 = 50;
        int radius2 = 100;
        int radius3 = 150;
        int radius4 = 200;
        
        g.drawOval(centerX - radius1, centerY - radius1, radius1 * 2, radius1 * 2);
        g.drawOval(centerX - radius2, centerY - radius2, radius2 * 2, radius2 * 2);
        g.drawOval(centerX - radius3, centerY - radius3, radius3 * 2, radius3 * 2);
        g.drawOval(centerX - radius4, centerY - radius4, radius4 * 2, radius4 * 2);
    


   }
}


