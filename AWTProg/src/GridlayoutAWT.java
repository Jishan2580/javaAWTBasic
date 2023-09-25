import java.awt.*;
import java.awt.event.WindowAdapter;
import  java.awt.event.WindowEvent;
public class GridlayoutAWT extends Frame {
    GridlayoutAWT(){
        this.setVisible(true);
        this.setBounds(30, 30, 500, 300);
        this.setBackground(Color.DARK_GRAY);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        GridLayout gl = new GridLayout(3,3,12,12);
                this.setLayout(gl);
        Button b1 = new Button("5");
        Button b2 = new Button("4");
        Button b3 = new Button("3");
        Button b4 = new Button("2");
        Button b5 = new Button("1");
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
    }

    public static void main(String[] args) {
        new GridlayoutAWT();
    }
}
