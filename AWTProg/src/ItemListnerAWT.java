import java.awt.Frame;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemListnerAWT extends Frame implements ItemListener {
    Checkbox cb1,cb2 ,cb3;

    Label l;
    ItemListnerAWT(){
        this.setVisible(true);
        this.setBounds(40,40,600,500);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Font ft = new Font("consolas",Font.BOLD, 40);
        l= new Label();
        l.setAlignment(Label.CENTER);
        l.setFont(ft);
        l.setSize(400,100);
        cb1= new Checkbox("tea");
        cb1.setFont(ft);
        cb1.setBounds(100,100,50,50);


        cb2=new Checkbox("coffee");
        cb2.setFont(ft);
        cb1.setBounds(100,150,80,50);
        cb3 =new Checkbox("green tea");
        cb3.setFont(ft);
        cb1.setBounds(100,200,80,50);
        //regester gui component to frame
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        //adding checkbox to frame
        this.add(cb1);
        this.add(cb2);
        this.add(cb3);
        this.add(l);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(cb1.getState()==true){
            l.setText("selected checkboc = Tea");
        }
        else if(cb2.getState()==true){
            l.setText("selected checkbox = coffee");
        }
        else if(cb3.getState()==true){
            l.setText("selected checkbox = green tea");

        }
    }

    public static void main(String[] args) {
        new ItemListnerAWT();
    }
}
