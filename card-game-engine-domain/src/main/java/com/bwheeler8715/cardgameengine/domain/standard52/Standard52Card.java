package com.bwheeler8715.cardgameengine.domain.standard52;

import com.bwheeler8715.cardgameengine.domain.Card;

public class Standard52Card implements Card {

    private Standard52CardType type;
    private Standard52CardValue value;

    public Standard52Card(Standard52CardType pType, Standard52CardValue pValue) {
        type = pType;
        value = pValue;
    }

    public Standard52CardType getType() {
        return type;
    }

    public Standard52CardValue getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card {" +
            "type=" + type +
            ", value=" + value +
            '}';
    }
}
