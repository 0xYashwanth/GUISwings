import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingButton extends JFrame implements ActionListener {
    JButton button;
    SwingButton() {
        button=new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setText("Click Me");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Hello");
        }
    }
}
