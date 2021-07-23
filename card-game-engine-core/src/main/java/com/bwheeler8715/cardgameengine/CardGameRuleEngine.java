package com.bwheeler8715.cardgameengine;

import com.bwheeler8715.cardgameengine.rule.Rule;
import com.bwheeler8715.cardgameengine.rule.Rule1;
import com.bwheeler8715.cardgameengine.rule.Rule2;

import java.util.ArrayList;
import java.util.List;

public class CardGameRuleEngine {

    private static List<Rule<Object>> RULES = new ArrayList<>();

    static {
        RULES.add(new Rule1());
        RULES.add(new Rule2());
    }

    public static void main(String... args) {
        Object action = new Object();

        for (Rule<Object> rule : RULES) {
            if (rule.applies(action)) {
                rule.execute(action);
            }
        }
    }
}
