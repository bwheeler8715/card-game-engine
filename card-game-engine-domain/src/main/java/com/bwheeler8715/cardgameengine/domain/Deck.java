package com.bwheeler8715.cardgameengine.domain;

import java.util.List;

public interface Deck<C extends Card> {

    void shuffleDeck();

    void dealDeck(int perPlayer, Player... players);

    C drawCard();

    C drawCardRandom();

    void addCard(int pPosition, C pCard);

    void addCardRandom(C pCard);

    List<C> lookAtCards(int pNum);

    List<C> getCards();
}
