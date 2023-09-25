import java.awt.*;
import java.awt.event.*;

public class ChoiceMenu extends Frame implements ActionListener,ItemListener {
    Choice c;
    Label lbl;
    Button b1,b2,b3;
    TextField tf;
    ChoiceMenu(){
        this.setVisible(true);
        this.setBounds(30,3,600,500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Font fnt = new Font("consolas", Font.BOLD, 20);
        lbl = new Label();
        lbl.setAlignment(Label.CENTER);
        lbl.setSize(400,10);
        lbl.setFont(fnt);
        //creating empty choice menu
        c = new Choice();
        c.setBounds(200,220,100,75);
        c.setFont(fnt);
        //creatin text field
        tf = new TextField("enter item ");
        tf.setFont(fnt );
        tf.setBounds(200,100,170,30);
        //creating three button
        b1=new Button("add");
        b1.setFont(fnt);
        b1.setBounds(50,150,100,30);
        b2=new Button("remove ");
        b2.setFont(fnt);
        b2.setBounds(200,150,100,30);
          b3=new Button("remove all");
        b3.setFont(fnt);
        b3.setBounds(350,150,110,30);

        //adding gui components
        this.add(lbl);this.add(b1);this.add(b2);this.add(b3);this.add(c);
        this.add(tf);
        //regiser choice to itemlistner
        c.addItemListener(this);
        //register button to actionlistner
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);




    }
    @Override
    public void actionPerformed(ActionEvent e) {
    String button_label = e.getActionCommand();//provide label from which action is generated
        if(button_label.equals("add")){
            c.add(tf.getText());
            lbl.setText("item added  "+ tf.getText());
        }
        if(button_label.equals("remove")){
            String selected_itm = c.getSelectedItem();//get the selected item
            c.remove(selected_itm);
            lbl.setText("item removed  "+ selected_itm);
        }
        if(button_label.equals("remove all")){
            c.removeAll();
            lbl.setText("all item removed  ");

        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
            lbl.setText("selected item  "+ c.getSelectedItem());

    }

    public static void main(String[] args) {
        new ChoiceMenu();
    }
}
