package com.gb.start;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GameWindow extends JFrame {

    private static GameWindow game_window;
    private static long  last_frame_time;
    private static Image background;
    private static Image game_over;
    private static Image drop;
    private static float drop_left = 200; //x
    private static float drop_top = -100; //y
    private static float drop_v = 200;

    public static void main(String[] args) throws IOException {
        game_window = new GameWindow();

        File back = new File("C:\\ikv\\ikv-app\\src\\main\\java\\com\\gb\\start\\back.png");
        background = ImageIO.read(back);


        BufferedImage dr = ImageIO.read(new File("C:\\ikv\\ikv-app\\src\\main\\java\\com\\gb\\start\\drop.png"));
        drop = dr;

        BufferedImage exit = ImageIO.read(new File("C:\\ikv\\ikv-app\\src\\main\\java\\com\\gb\\start\\gover.png"));
        game_over = exit;

        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_window.setLocation(200, 100);
        game_window.setSize(1500, 900);
        game_window.setResizable(false);
        last_frame_time = System.nanoTime();
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
    }
    private static void onRepaint (Graphics g) {
        long current_time = System.nanoTime();
        float delta_time = (current_time - last_frame_time) * 0.000000001f;
        last_frame_time = current_time;
        drop_top = drop_top + drop_v * delta_time;
        drop_left = drop_left + drop_v * delta_time;
        g.drawImage(background, 0, 0, null);
        g.drawImage(drop, (int) drop_left, (int) drop_top, null);
       // g.drawImage(game_over, 450, 300, null);
        System.out.println(last_frame_time);
    }

    private static class GameField extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            onRepaint(g);
            repaint(); //repaint panel
        }
    }
}
