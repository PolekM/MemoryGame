package MemoryGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class Board {
    private JFrame frame;
    private List<JButton> cardList;
    private ArrayList<String> nameCard = new ArrayList<>(
            Arrays.asList("1", "1", "2", "2", "3", "3", "4", "4", "5", "5", "6", "6", "7", "7", "8", "8"));

    Board() {
        createBoard();

    }

    private void createBoard() {
        createListOfCard();
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        cardList.forEach(card -> {
            card.addActionListener(e -> {
                reversCard(card);
            });
            frame.add(card);
        });
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void reversCard(JButton card) {

    }


    private void createListOfCard() {
        Collections.shuffle(nameCard);
        cardList = new ArrayList<>();
        int x = 0;
        int col = 45;
        int row = 35;
        while (x < 16) {
            if (x % 4 == 0 && x != 0) {
                row += 130;
                col = 45;
            }
            Card tempCard = new Card(col, row);
            tempCard.getMemoryCard().setName(nameCard.get(x));
            cardList.add(tempCard.getMemoryCard());
            col += 130;
            x++;
        }
    }


}


