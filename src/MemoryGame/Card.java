package MemoryGame;

import javax.swing.*;

public class Card {

    private final int widthCard;
    private final int heightCard;
    private final int posX;
    private final int posY;
    private JButton memoryCard = new JButton();

    Card(int posX, int posY) {
        this.widthCard = 100;
        this.heightCard = 100;
        this.posX = posX;
        this.posY = posY;
        creatMemoryCard();
    }

    public int getWidthCard() {
        return widthCard;
    }

    public int getHeightCard() {
        return heightCard;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public JButton getMemoryCard() {
        return memoryCard;
    }

    private void creatMemoryCard() {
        this.memoryCard.setBounds(this.posX, this.posY, this.widthCard, this.heightCard);

    }

}
