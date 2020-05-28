import java.awt.Color;

public class TurtleDemo
{
    public static void main(String[] args)
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.RED);
        crush.penDown();
        crush.forward(50);
    }
}
