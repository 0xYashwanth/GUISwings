
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code=KeyEvent1 width=600 height=500>
</applet>*/

public class KeyEvent1 extends Applet implements KeyListener {
    int x = 40, y = 50;
    String msg = "Key Events";

    public void init() {
        //setBackground(Color.black);
        setForeground(Color.BLACK);
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent Ke) {
        showStatus("Key Pressed");
    }

    public void keyReleased(KeyEvent Ke) {
        showStatus("Key Released");
    }

    public void keyTyped(KeyEvent Ke) {
        msg = "Key Typed";
        // msg+=ke.getKeyChar();
        showStatus("keyTyped");
    }

    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }

    // @Override
    // public void keyTyped(KeyEvent e) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    // }

    // @Override
    // public void keyPressed(KeyEvent e) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    // }

    // @Override
    // public void keyReleased(KeyEvent e) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    // }
}