import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by root on 5/23/16.
 */
public class Main extends JFrame implements ActionListener
{

    private static Timer timer;
    public static final int WIDTH = 640, HEIGHT = 360;
    private static Racer racer1, racer2;

    public static void main(String[] args)
    {
        Main m = new Main();
        m.setVisible();
    }

    public Main()
    {
        setSize(WIDTH, HEIGHT);
        racer1 = new Racer();
        racer2 = new Racer();

    }

    public void actionPerformed(ActionEvent e)



}
