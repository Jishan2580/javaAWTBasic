import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyEventAWT extends Frame{
    KeyEventAWT(){
        this.setVisible(true);
        this.setBounds(30, 30, 500, 300);
        this.setBackground(Color.DARK_GRAY);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("key typed" + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("key pressed" + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("key released" + e.getKeyChar());
            }

        });
    }

    public static void main(String[] args) {
        new KeyEventAWT();
    }
}
