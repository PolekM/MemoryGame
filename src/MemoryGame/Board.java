package MemoryGame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Board {
    private JFrame frame;
    private List<JButton> cardList = new ArrayList<>();

    Board() {
        createBoard();

    }

    private void createBoard() {
        createListOfCard();
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLayout(null);
        cardList.forEach(card -> frame.add(card));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    private void createListOfCard() {
        int x = 0;
        int col = 45;
        int row = 35;
        while (x < 16) {
            if (x % 4 == 0 && x != 0) {
                row += 130;
                col = 45;
            }
            Card tempCard = new Card(col, row);
            cardList.add(tempCard.getMemoryCard());

            col += 130;
            x++;
        }
    }

}


