package org.example.sandbox.cards;

public class DeckDriver {

    public static void main(String[] args) {

        Deck cards = new StandardDeck();
        displayDeck(cards);

        cards.shuffle();
        System.out.println("Shuffled:");
        displayDeck(cards);

        cards.shuffle();
        System.out.println("Shuffled:");
        displayDeck(cards);

        Card card = cards.turnOver();

        System.out.println("Turn over:");
        System.out.println(card);

        cards.cut(cards.size() / 2);
        System.out.print("Cut deck:");
        displayDeck(cards);

    }

    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }
}