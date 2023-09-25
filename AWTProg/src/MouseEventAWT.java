import java.awt.*;
import java.awt.event.*;

public  class MouseEventAWT extends Frame {
    MouseEventAWT() {

        this.setVisible(true);
        this.setBounds(30, 30, 500, 300);
        this.setBackground(Color.DARK_GRAY);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouse clicked " + e.getX() + " " + e.getY());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouse exited " + "[e.getX()  + e.getY()]");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouse entered " + e.getX() + " " + e.getY());
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println("mouse whewl moved  " + e.getX() + " " + e.getY());
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new MouseEventAWT();
    }
}
