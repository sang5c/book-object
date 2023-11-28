package com.example.bookobject.ch02.discount;

import com.example.bookobject.ch02.Money;
import com.example.bookobject.ch02.Screening;

import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions;

    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        return conditions.stream()
                .filter(condition -> condition.isSatisfiedBy(screening))
                .findFirst()
                .map(condition -> getDiscountAmount(screening))
                .orElse(Money.ZERO);
    }

    protected abstract Money getDiscountAmount(Screening screening);
}
