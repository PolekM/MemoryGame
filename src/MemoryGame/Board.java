package MemoryGame;

import javax.swing.*;
import java.awt.*;

public class Board {
    private JFrame frame;
    private JPanel panel;
    Board(){
        createBoard();
    }
    private void createBoard(){
        frame = new JFrame();
        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Memory Game");

        frame.pack();
        frame.setVisible(true);
    }
}
