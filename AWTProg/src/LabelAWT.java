/*  1) in java label class is used to display simple text on the GUI
* 2) one label object can render only one text from it  */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelAWT extends  Frame {
    LabelAWT(){
        Label l1 = new Label("user name");
        Label l2 = new Label("password");
        this.setVisible(true);
        this.setBounds(30,30,500,300);
        l1.setBounds(20,20,20,50);
        l1.setBounds(40,40,20,50);

        this.add(l1);
        this.add(l2);
        //this.dispose();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        LabelAWT lw = new LabelAWT();
    }
}
