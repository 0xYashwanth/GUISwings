import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="ChoiceDemo" width=400 height=457></applet> */
public class ChoiceDemo extends Applet implements ItemListener{
    Choice mobile, apps;
	String msg = "";
	public void init() 
	{	
        mobile = new Choice();
        apps = new Choice();

        // add items to mobile list
        mobile.add("Nokia"); 		
        mobile.add("Samsung");
        mobile.add("Apple");		
        mobile.add("Sony");

        // add items to apps list
        apps.add("WhatsApp");	
        apps.add("Maps");
        apps.add("Facebook");
        apps.add("TOI");

        // add choice lists to window
            add(mobile);	
            add(apps);

        // register to receive item events
            mobile.addItemListener(this);	
            apps.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        String msg="My Phone ";
        msg += mobile.getSelectedItem();
		g.drawString(msg, 6, 120);

		msg = "Most Used App: ";
		msg += apps.getSelectedItem();
		g.drawString(msg, 6, 140);
    }
}
