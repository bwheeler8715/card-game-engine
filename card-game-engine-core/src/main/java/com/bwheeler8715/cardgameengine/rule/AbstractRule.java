package com.bwheeler8715.cardgameengine.rule;

import java.util.function.Function;
import java.util.function.Predicate;

public class AbstractRule<O> implements Rule<O> {

    private final Predicate<? super O> predicate;
    private final Function<? super O, Void> function;

    public AbstractRule(Predicate<? super O> pPredicate, Function<? super O, Void> pFunction) {
        predicate = pPredicate;
        function = pFunction;
    }

    @Override
    public boolean applies(O object) {
        return predicate.test(object);
    }

    @Override
    public void execute(O object) {
        function.apply(object);
    }
}
