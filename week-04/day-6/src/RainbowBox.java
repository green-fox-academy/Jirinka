import javax.swing.*;

import java.awt.*;

import static java.awt.Color.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

class RainbowBoxFunction {


    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        for (int i = 1; i < 8; i++) {
            int size = (i*30);
            //chooseColor(i, graphics);
            drawSquare(size, i, graphics);

            }

    }

    public static void drawSquare(int size, int colorCode, Graphics graphics){

        graphics.drawRect((WIDTH/2)-(size/2), (HEIGHT/2)-(size/2), size, size);

        Color indigo = new Color(0, 0, 153);
        Color violet = new Color(153, 0, 204);

        switch (colorCode) {
            case 1:
                graphics.setColor(red);
                break;
            case 2:
                graphics.setColor(orange);
                break;
            case 3:
                graphics.setColor(yellow);
                break;
            case 4:
                graphics.setColor(green);
                break;
            case 5:
                graphics.setColor(blue);
                break;
            case 6:
                graphics.setColor(indigo);
                break;
            case 7:
                graphics.setColor(violet);
                break;

        }
    /*public static void chooseColor (int colorCode, Graphics graphics) {
        Color indigo = new Color(0, 0, 153);
        Color violet = new Color(153, 0, 204);

        switch (colorCode) {
            case 1:
                graphics.setColor(red);
                break;
            case 2:
                graphics.setColor(orange);
                break;
            case 3:
                graphics.setColor(yellow);
                break;
            case 4:
                graphics.setColor(green);
                break;
            case 5:
                graphics.setColor(blue);
                break;
            case 6:
                graphics.setColor(indigo);
                break;
            case 7:
                graphics.setColor(violet);
                break;

        }*/



    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

