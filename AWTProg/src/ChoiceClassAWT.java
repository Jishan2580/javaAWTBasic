import java.awt.*;
import java.awt.event.*;

public class ChoiceClassAWT extends Frame {
    ChoiceClassAWT(){
        this.setVisible(true);
        this.setBounds(30,30,600,500);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Font ft = new Font("consolas",Font.ITALIC,20);
        Choice ch = new Choice();
        ch.setFont(ft);
        ch.setBounds(40,40,100,30);
        ch.add("milk");
        ch.add("coffee");
        ch.add("tea");
        this.add(ch);
    }

    public static void main(String[] args) {
        new ChoiceClassAWT();
    }
}
