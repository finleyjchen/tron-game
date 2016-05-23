import java.util.Observable;
/**
 * Created by root on 5/23/16.
 */
public class Racer extends Observable {
    private int x, y, speed;
    private int[][] field;
    private String direction;
    private Path path;


    public Racer()
    {
        x = 0;
        y = 0;
        speed = 5;
        direction = "right";
        field = new int[WIDTH][HEIGHT];


    }

    public void move()
    {
        switch(direction) {
            case "up"
                moveUp();
                break;
            case "down"
                moveDown();
                break;
            case "left"
                moveLeft();
                break;
            case "right"
                moveRight();
                break;
        }
        changeField()
        setChanged();
        notifyObservers();

    }
    // leaves the trail coordinates, changes Path
    public void leaveTrail()
    {

    }

    public boolean checkDead()
    {


    }

    public void moveUp()
    {
        checkDead();
        y -= speed;
    }

    public void moveDown()
    {
        checkDead();
        y += speed;
    }

    public void moveLeft()
    {
        checkDead();
        x -= speed;
    }

    public void moveRight()
    {
        checkDead();
        x += speed;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getSpeed()
    {
        return speed;
    }







}