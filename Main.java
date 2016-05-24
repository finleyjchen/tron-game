import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by root on 5/23/16.
 */
public class Main extends JFrame implements ActionListener, KeyListener
{

    private static Timer timer;
    public static final int WIDTH = 1600, HEIGHT = 900;
    private static Racer racer1, racer2;
    private static RacerView view;
    private JPanel scorePanel;
    private boolean inMenu;
    private MenuView menuView;
    private CardLayout cardLayout;
    private Container c;

    public static void main(String[] args)
    {
        Main m = new Main();
        m.setVisible(true);
    }

    public Main()
    {
        cardLayout = new CardLayout();
        setSize(WIDTH,  HEIGHT);
        setTitle("Tr0n");
        setLocation (50, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setBackground(Color.DARK_GRAY);

        c.setLayout(cardLayout);


        racer1 = new Racer((WIDTH / 2) + (WIDTH / 3), HEIGHT / 2);
        racer2 = new Racer((WIDTH / 2) - (WIDTH / 3), HEIGHT / 2);
        timer = new Timer(30, this);
        view = new RacerView(racer1, racer2);
        try {
            menuView = new MenuView();
        } catch(Exception e)
        {
            System.out.println("Error");
        }
        c.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        c.add(menuView);
        c.add(view);
        pack();

        JMenuItem m;
        JMenu menu = new JMenu("Options");
        m = new JMenuItem("Play");	// Create a menu option
        m.addActionListener(this);
        menu.add(m);
        m = new JMenuItem("Pause");	// Create a menu option
        m.addActionListener(this);
        menu.add(m);

        JMenuBar mBar = new JMenuBar();
        mBar.add(menu);
        setJMenuBar(mBar);
        racer1.addObserver(view);
        racer2.addObserver(view);
        addKeyListener(this);

        //Cursor cursor = Toolkit.getDefaultToolkit().createCustomCursor("volger.png", new Point(0, 0), "Name");


    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == timer)
        {
            racer1.move();
            racer2.move();
        }

        if(e.getActionCommand() == "Play")
        {
            cardLayout.next(c);
            timer.start();
        }

        if(e.getActionCommand() == "Pause")
        {
            timer.stop();
        }


    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_W)
        {
            racer2.setDirection("up");

        }

        if(e.getKeyCode() == KeyEvent.VK_A)
        {
            racer2.setDirection("left");

        }

        if(e.getKeyCode() == KeyEvent.VK_S)
        {
            racer2.setDirection("down");

        }

        if(e.getKeyCode() == KeyEvent.VK_D)
        {
            racer2.setDirection("right");

        }

        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            racer1.setDirection("up");

        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            racer1.setDirection("left");

        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            racer1.setDirection("down");

        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            racer1.setDirection("right");

        }
    }

    public void keyReleased(KeyEvent e)
    {

    }



}
