package com.bwheeler8715.cardgameengine.domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

    protected List<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void addCard(Card pCard) {
        hand.add(pCard);
    }

    public List<Card> getHand() {
        return hand;
    }
}
