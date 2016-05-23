import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by root on 5/23/16.
 */
public class RacerView extends JPanel implements Observer {
    private Racer racer1, racer2;
    private int[][] field;

    public RacerView()
    {
        field = new int[WIDTH][HEIGHT];

    }
    public void update(Observable o, Object obj)
    {
        setBackground(Color.BLACK);
        field[racer1.getX()][racer1.getY()] = [1][1];
        repaint();

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.

    }

}
