package com.example.bookobject.ch02.discount;

import com.example.bookobject.ch02.Money;
import com.example.bookobject.ch02.Screening;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().minus(discountAmount);
    }
}
