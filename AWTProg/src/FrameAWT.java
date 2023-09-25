import java.awt.*;

public class FrameAWT extends Frame{
    FrameAWT(){
        this.setVisible(true);//set the screen visible
        this.setBounds(30,30,200,400);
        this.setTitle("first awt ");
        this.setBackground(Color.BLUE);
        this.dispose();
    }

    public static void main(String[] args) {
        FrameAWT ft= new FrameAWT();
    }

}
