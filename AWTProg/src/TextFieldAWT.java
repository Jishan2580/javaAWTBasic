import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TextFieldAWT extends  Frame {
    TextFieldAWT(){
        Label l1 = new Label();
        l1.setText("password");
        TextField t = new TextField();
        l1.setBounds(50,100,100,50);
        t.setBounds(160,100,200,50);
        t.setText("enter pass");
        this.add(l1);
        this.add(t);
        this.setLayout(null);
        this.setVisible(true);
        this.setBounds(30,30,500,300);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        TextFieldAWT twt = new TextFieldAWT();

    }
}
