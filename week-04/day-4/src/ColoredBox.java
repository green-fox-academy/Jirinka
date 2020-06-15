import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {

        drawSquare(graphics);



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
   /* public static void color() {
        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        Color randomColor = new Color(red,green,blue);
        graphics.setColor(randomColor);

    }*/

    public static void drawSquare (Graphics graphics) {

        color(graphics);
        graphics.drawLine(10,10,110,10);

        color(graphics);
        graphics.drawLine(110,10,110,110);

        color(graphics);
        graphics.drawLine(110,110,10,110);

        color(graphics);
        graphics.drawLine(10,110,10,10);

    }
    public static void color (Graphics graphics) {

        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        Color randomColor = new Color(red,green,blue);
        graphics.setColor(randomColor);
}
}

