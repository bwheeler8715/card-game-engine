package com.bwheeler8715.cardgameengine.domain.standard52;

import com.bwheeler8715.cardgameengine.domain.AbstractDeck;

public class Standard52Deck extends AbstractDeck<Standard52Card> {

    public Standard52Deck() {
        initDeck();
        for (Standard52CardType type : Standard52CardType.values()) {
            for (Standard52CardValue value : Standard52CardValue.values()) {
                cards.add(new Standard52Card(type, value));
            }
        }
    }
}
