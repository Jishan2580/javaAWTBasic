import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionListnerAWT extends Frame{
    ActionListnerAWT(){

        this.setVisible(true);
        this.setBounds(30,30,600,500);
        this.setBackground(Color.black);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Button b1 = new Button("click me");
        b1.setBounds(50,50,40,30);
        b1.setForeground(Color.WHITE);
          this.add(b1);
          Label l = new Label();
          l.setForeground(Color.WHITE);
          this.add(l);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("you clicked button ");
                Font ft = new Font("Arial",Font.ITALIC,25);
                l.setFont(ft);//this is required if we are setting font eexternally




            }
        });
    }

    public static void main(String[] args) {
        new ActionListnerAWT();
    }
}
