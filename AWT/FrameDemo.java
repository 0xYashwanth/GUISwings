import java.awt.*;
import java.awt.event.WindowAdapter;
public class FrameDemo extends Frame{
    FrameDemo(String title)
    {
        super(title);
        setSize(700, 700);
        setVisible(true);
        setBackground(Color.CYAN);
        setForeground(Color.BLACK);
        addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowAdapter we)
            {
                System.exit(0);
            }
        } 
        );
    }
    public void paint(Graphics g)
    {
        g.drawLine(40, 225, 250, 180);

		g.drawRect(10, 50, 60, 50);
		g.fillRect(100, 50, 30, 30);
	
		g.drawRoundRect(190, 50, 60, 50, 15, 15);
		g.fillRoundRect(270, 100, 140, 100, 30, 40);

		g.drawOval(300, 250, 50, 50);
		g.fillOval(70, 90, 140, 100);
    }
    public static void main(String[] args) {
        new FrameDemo("MY first new frame");
        System.out.println("This is an application");
    }
}
