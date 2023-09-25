import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EchoCharAWT extends  Frame {
    EchoCharAWT(){
        this.setVisible(true);
        this.setBounds(30,30,500,300);
        Label l1 = new Label();

        l1.setText("username");
        TextField t1= new TextField();
        t1.setEchoChar('*');
        t1.setBounds(90,30,60,60);
        l1.setBounds(30,30,60,50);

        this.setLayout(null);
        this.add(l1);
        this.add(t1);
        this.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        EchoCharAWT ecwt= new EchoCharAWT();
    }
}
