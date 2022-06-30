package MemoryGame;

import javax.swing.*;
import java.awt.*;

public class Card {

    private final int widthCard;
    private final int heightCard;
    private final int posX;
    private final int posY;
    private final String cardImage;
    private JButton memoryCard;

    Card(int posX, int posY, String cardImage) {
        this.widthCard = 100;
        this.heightCard = 100;
        this.posX = posX;
        this.posY = posY;
        this.cardImage = cardImage;
        creatMemoryCard();
    }

    public JButton getMemoryCard() {
        return memoryCard;
    }

    private void creatMemoryCard() {

        memoryCard = new JButton(new ImageIcon("images/reverse.png"));
        this.memoryCard.setBounds(this.posX, this.posY, this.widthCard, this.heightCard);


    }

}
