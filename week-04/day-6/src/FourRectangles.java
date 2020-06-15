import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.

        // avoid code duplication.
        for (int i = 1; i < 5; i++) {
            color(graphics);
            drawRectangle(graphics);
        }


    }

    public static void drawRectangle (Graphics graphics) {
        Random random = new Random();
        int x = random.nextInt(300);
        int y = random.nextInt(300);
        int size = random.nextInt(290);
        graphics.drawRect(x,y,size, size);
    }
    public static void color (Graphics graphics) {
        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);

        Color randomColor = new Color(red, green, blue);
        graphics.setColor(randomColor);


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