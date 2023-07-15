import java.applet.*;
import java.awt.*;
/*<applet code="LabelDemo" width=300 height=200></applet> */
public class LabelDemo extends Applet
{
    public void init()
    {
        Label one=new Label("one");
        Label two=new Label("two");
        add(one);
        add(two);
    }
}