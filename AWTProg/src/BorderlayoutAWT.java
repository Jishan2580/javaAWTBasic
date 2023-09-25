import java.awt.*;
import java.awt.event.WindowAdapter;
import  java.awt.event.WindowEvent;

public class BorderlayoutAWT extends Frame{
    BorderlayoutAWT(){
        this.setVisible(true);
        this.setBounds(30, 30, 500, 300);
        this.setBackground(Color.DARK_GRAY);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        BorderLayout bl = new BorderLayout(15, 25);
        this.setLayout(bl);//intitialize this border on frame
        Button b1 = new Button("north");
        Button b2 = new Button("south");
        Button b3 = new Button("east");
        Button b4 = new Button("west");
        Button b5 = new Button("centre");
        this.add(b1, BorderLayout.NORTH);
        this.add(b2, BorderLayout.SOUTH);
        this.add(b3, BorderLayout.EAST);
        this.add(b4, BorderLayout.WEST);
        this.add(b5, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new BorderlayoutAWT();
    }
}
