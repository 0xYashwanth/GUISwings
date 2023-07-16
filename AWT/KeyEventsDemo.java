import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code=KeyEventsDemo height="300" width="300">
</applet>*/

public class KeyEventsDemo extends Applet implements KeyListener {
    String msg = "Hello";
    String keyState = "";

    public void init() {
        addKeyListener(this);
        //addComponentListener((ComponentListener) new MyWindowAdapter());
    }

    public void keyPressed(KeyEvent ke) {
        keyState = "key down";
        int key = ke.getKeyCode();

        switch (key) {
            case KeyEvent.VK_F1:
                msg += "<F1>";
                break;
            case KeyEvent.VK_F2:
                msg += "<F2>";
                break;
            case KeyEvent.VK_F3:
                msg += "<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg += "PgDn";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg += "PgUp";
                break;
            case KeyEvent.VK_LEFT:
                msg += "<Left Arrow";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "<Right Arrow";
                break;
        }

    }

    public void keyReleased(KeyEvent ke) {
        keyState = "Key Up";

    }

    public void keyTyped(KeyEvent ke) {
        keyState = "Key Typed";
        msg += ke.getKeyChar();

    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }

    class MyWindowAdapter extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}
