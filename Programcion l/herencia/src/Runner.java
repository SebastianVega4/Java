import javax.swing.*;
import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        Window myWindow = new Window("Ejemplo de Pintar");
        myWindow.setVisible( true );

        Figure circle = new Circle(new Point(10,300),Color.BLUE, 20);
        showFigure( circle,myWindow );

        Figure rectangle = new Rectangle(new Point(100,200),Color.GREEN, 25,12);
        showFigure( rectangle, myWindow );

        myWindow.getGraphics().drawPolygon(new int[]{60,120,300,280},new int[]{120,180,80,420},4);
    }

    static private void showFigure(Figure figure, JFrame window){
        System.out.printf("El Area es %f\n",figure.calcArea());
        figure.drawFigure(window.getGraphics());
    }
}