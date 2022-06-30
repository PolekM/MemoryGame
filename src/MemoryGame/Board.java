package MemoryGame;

import javax.swing.*;
import java.util.*;
import java.util.List;

import static javax.swing.JOptionPane.*;


public class Board {
    private JFrame frame;
    private List<JButton> cardList = new ArrayList<>();
    private final ArrayList<String> nameCard = new ArrayList<>(
            Arrays.asList("1", "1", "2", "2", "3", "3", "4", "4", "5", "5", "6", "6", "7", "7", "8", "8"));
    private static int flag = 0;
    private static JButton temp = new JButton();
    public static int point = 0;

    Board() {

        createBoard();
    }

    private void createBoard() {
        createListOfCard();
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        AddCardToFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    private void AddCardToFrame() {
        cardList.forEach(card -> {

            card.addActionListener(e -> {
                if (card != temp)
                    ShowCard(card);
                if (flag == 2) {
                    CheckPair(card, temp);
                    temp = null;
                } else
                    temp = card;

            });

            card.addActionListener(e -> {
                if (flag == 2)
                    HideCard();
            });

            frame.add(card);

        });
    }

    private void CheckPair(JButton firstCard, JButton secondCard) {

        if (firstCard.getName().equals(secondCard.getName())) {
            firstCard.setVisible(false);
            secondCard.setVisible(false);
            flag = 0;
            point++;

            if (point == 8) {
                showMessageDialog(frame, "Wygrałeś!");
                frame.dispose();
            }
        }
    }


    private void HideCard() {

        cardList.forEach(card -> card.setIcon(new ImageIcon("images/reverse.png")));
        flag = 0;

    }

    private void ShowCard(JButton card) {

        card.setIcon(new ImageIcon("images/Pair_" + card.getName() + ".png"));
        flag++;

    }


    private void createListOfCard() {

        Collections.shuffle(nameCard);
        int x = 0;
        int col = 45;
        int row = 35;
        while (x < 16) {

            if (x % 4 == 0 && x != 0) {
                row += 130;
                col = 45;
            }

            Card tempCard = new Card(col, row, "images/Pair_" + nameCard.get(x) + ".png");
            tempCard.getMemoryCard().setName(nameCard.get(x));
            cardList.add(tempCard.getMemoryCard());
            col += 130;
            x++;

        }
    }
}


