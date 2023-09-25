import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontDemoAWT extends  Frame {
    FontDemoAWT(){
        this.setVisible(true);
        this.setBounds(30,30,500,300);
        this.setTitle("Font awt");
        this.setBackground(Color.DARK_GRAY);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // Handle window close event here, if needed
                System.exit(0); // Exit the application when the window is closed
            }
        });

    }

    @Override
    public void paint(Graphics g){
        Font ft = new Font("Arial",Font.BOLD,20);
        g.setFont(ft);//this is required to set above font specification
        g.drawString("jiahsn shiakh ",50,50);
    }

    public static void main(String[] args) {
        FontDemoAWT fdt= new FontDemoAWT();
        //fdt.paint() no need to call this as paint is automatically called
    }
}
