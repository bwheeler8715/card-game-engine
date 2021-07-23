package com.bwheeler8715.cardgameengine.domain.standard52;

public enum Standard52CardType {
    DIAMOND(Color.RED),
    HEART(Color.RED),
    SPADE(Color.BLACK),
    CLOVER(Color.BLACK);

    private final Color color;

    Standard52CardType(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    private enum Color {
        BLACK, RED
    }
}
