package com.example.bookobject.ch02.discount;

import com.example.bookobject.ch02.Money;
import com.example.bookobject.ch02.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
