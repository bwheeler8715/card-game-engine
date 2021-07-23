package com.bwheeler8715.cardgameengine;

import com.bwheeler8715.cardgameengine.domain.Player;
import com.bwheeler8715.cardgameengine.domain.standard52.Standard52Deck;

public class DefaultCardGameService {

    public static void main(String... args) {
        Player player1 = new Player();
        Player player2 = new Player();

        Standard52Deck deck = new Standard52Deck();
        deck.shuffleDeck();
        deck.dealDeck(7, player1, player2);

        boolean gameRunning = true;
        while (gameRunning) {

            // Game end
            gameRunning = false;
        }
    }
}
