package com.bwheeler8715.cardgameengine.domain;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class AbstractDeck<C extends Card> implements Deck<C> {

    protected LinkedList<C> cards;

    protected void initDeck() {
        cards = new LinkedList<>();
    }

    @Override
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    @Override
    public void dealDeck(int perPlayer, Player... players) {
        for (int i = 0; i < perPlayer; i++) {
            for (Player p : players) {
                p.addCard(this.drawCard());
            }
        }
    }

    @Override
    public C drawCard() {
        return cards.removeFirst();
    }

    @Override
    public C drawCardRandom() {
        int randInt = new Random().nextInt(cards.size() - 1);
        return cards.get(randInt);
    }

    @Override
    public void addCard(int pPosition, C pCard) {
        cards.add(pPosition, pCard);
    }

    @Override
    public void addCardRandom(C pCard) {
        int randInt = new Random().nextInt(cards.size() - 1);
        cards.add(randInt, pCard);
    }

    @Override
    public List<C> lookAtCards(int pNum) {
        return cards.stream()
            .limit(pNum)
            .collect(Collectors.toList());
    }

    @Override
    public List<C> getCards() {
        return cards;
    }
}
