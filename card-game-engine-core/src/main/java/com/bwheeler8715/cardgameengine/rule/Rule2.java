package com.bwheeler8715.cardgameengine.rule;

public class Rule2 implements Rule<Object> {

    @Override
    public boolean applies(Object object) {
        return true;
    }

    @Override
    public void execute(Object object) {
        System.out.println("Rule 2 executing.");
    }
}
