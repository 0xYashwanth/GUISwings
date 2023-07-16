import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
import java.applet.*;
/*<applet code="TrafficLight" width=400 height=457></applet> */
public class TrafficLight extends Applet implements ItemListener 
{
    Checkbox red,green,yellow;
    Color c1;
    String s;
    CheckboxGroup c=new CheckboxGroup();
    public void init()
    {
        red=new Checkbox("red", c, true);
        green=new Checkbox("green", c, false);
        yellow=new Checkbox("yellow", c, false);
        add(red);
        red.addItemListener(this);
        add(yellow);
        yellow.addItemListener(this);
        add(green);
        green.addItemListener(this);
        c1=Color.RED;
        s="red";
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        s=c.getSelectedCheckbox().getLabel();
        if(s=="red")
            c1=Color.red;
        if(s=="green")
            c1=Color.green;
        if(s=="yellow")
            c1=Color.yellow;
        repaint();
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
		g.drawOval(70,70,20,20);
		g.drawOval(70,110,20,20);
		g.drawOval(70,150,20,20);
		g.drawRect(60,60,40, 120);

		g.setColor(c1);

		if(c1==Color.red)
			g.fillOval(70,70,20,20);
		else if(c1==Color.yellow)
			g.fillOval(70,110,20,20);
		else 
			g.fillOval(70,150,20,20);

		showStatus("Selected "+ s);
    }
}
