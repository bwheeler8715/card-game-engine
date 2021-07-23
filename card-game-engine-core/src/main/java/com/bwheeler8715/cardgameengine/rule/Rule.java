package com.bwheeler8715.cardgameengine.rule;

public interface Rule<O> {

    boolean applies(O object);

    void execute(O object);
}
