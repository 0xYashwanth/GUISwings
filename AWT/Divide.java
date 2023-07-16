import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Divide" width=500 height=300>	</applet>*/
public class Divide extends Applet implements ActionListener {
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(20);
    TextField t3 = new TextField(30);
    Button b1 = new Button("compute");

    public void init() {
        Label l1 = new Label("divide A/B");
        Label l2 = new Label("enter A");
        Label l3 = new Label("enter B");
        Label l4 = new Label("result");

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
        add(t3);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int c;
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            c = a / b;
            String s = "" + c;
            t3.setText(s);
        } catch (NumberFormatException n) {
            t3.setText("");
            showStatus("Number format Exception");
        } catch (ArithmeticException n) {
            t3.setText("");
            showStatus("Divide By Zero Exception");
        }
    }
}
