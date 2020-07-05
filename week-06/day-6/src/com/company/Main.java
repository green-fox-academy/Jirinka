package com.company;

import javax.swing.*;

import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    public static void mainDraw(Graphics graphics) {
        int side = 150;
        int x = ((HEIGHT/2)-(side/2));
        int y = ((WIDTH/2)-(side/2));

        //drawSquares(graphics, x, y, side, 0);
        drawFilledSquares(graphics,side,x,y,0);
    }

        public static void drawSquares (Graphics graphics, int x, int y, int side, int level) {
            if (level > 3) {
                return;
            }
            graphics.drawRect(x, y, side, side);

            drawSquares(graphics, (x + side - side/4), (y - side/4), side/2, level +1);
            drawSquares(graphics, (x - side/4), (y - side/4), side/2, level +1);
            drawSquares(graphics, (x + side - side/4), (y + side - side/4), side/2, level +1);
            drawSquares(graphics, (x - side/4), (y + side - side/4), side/2, level +1);

        }
        public static void drawFilledSquares (Graphics graphics, int side, int startX, int startY, int level){
            if (level > 4){
                return;
            }
            graphics.setColor(Color.black);
            graphics.fillRect(startX, startY, side, side);

            drawFilledSquares(graphics, side, startX, startY, level+1);

            drawFilledSquares(graphics,side/3, ((startX-(2*side/3))), startY-(2*(side/3)), level+1);
            drawFilledSquares(graphics,side/3, startX+side+(side/3), startY-(2*side/3), level +1);
            drawFilledSquares(graphics,side/3, ((startX-(2*side/3))), startY+side+(side/3), level +1);
            drawFilledSquares(graphics,side/3, ((startX+side+(side/3))), startY+side+(side/3), level +1);
            //middle ones
            drawFilledSquares(graphics, side/3, ((startX-(2*side/3))), startY+side/3, level+1);
            drawFilledSquares(graphics, side/3, ((startX+side+side/3)), startY+side/3, level+1);
            drawFilledSquares(graphics, side/3, ((startX+side/3)), startY-(2*(side/3)), level+1);
            drawFilledSquares(graphics, side/3, ((startX+side/3)), startY+side+(side/3), level+1);
        }


    //}






    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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
        private Graphics2D Graphics2D;

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);


        }

    }
}



