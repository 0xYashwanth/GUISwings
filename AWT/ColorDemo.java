// Program toDemonstrate color.
import java.awt.*;
import java.applet.*;
/*
<applet code="ColorDemo" width=300 height=200>
</applet>
*/
public class ColorDemo extends Applet {
// draw lines
public void paint(Graphics g) {
Color c1 = new Color(255, 100, 100);
Color c2 = new Color(0, 255, 0);
Color c3 = new Color(100, 100, 255);
g.setColor(c1);
g.drawLine(0, 0, 100, 100);
g.setColor(c2);
g.drawLine(0, 90, 400, 400);

g.setColor(Color.red);
g.drawOval(10, 10, 50, 50);
g.fillOval(70, 90, 140, 100);

g.setColor(Color.blue);
g.drawOval(190, 10, 90, 30);


g.setColor(Color.cyan);
g.fillRect(100, 10, 60, 50);

}
}
