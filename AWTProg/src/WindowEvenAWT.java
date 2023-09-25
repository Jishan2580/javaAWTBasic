import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//if we are using this type of method then we have to implement all the method defined in WindowListner class
public class WindowEvenAWT extends Frame implements WindowListener{
    WindowEvenAWT(){
        this.setVisible(true);
        this.setBounds(30,30,500,300);
        Font font = new Font("Arial",Font.ITALIC,20);
        this.setFont(font);
        this.setBackground(Color.CYAN);
        this.setLayout(null);
        addWindowListener(this);
    }

    public static void main(String[] args) {
        new WindowEvenAWT();

    }
    //method is called when open window

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window in open ");
    }

    //mthod is called when close option in clicked
    public void windowClosing(WindowEvent e){
        System.out.println("window is closed by user ");
        System.exit(0);
    }


    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window is minimized ");
    }


    //method when window is activated
    public void windowActivated(WindowEvent e ){
        System.out.println("window is activited ");
    }
    public void windowDeactivated(WindowEvent e){
        System.out.println("window is deactivited ");
    }
    public void windowClosed(WindowEvent e ){
        System.out.println("window is closed ");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window is minimized ");
    }

}
