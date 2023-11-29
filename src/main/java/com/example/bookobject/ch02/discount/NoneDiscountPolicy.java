package com.example.bookobject.ch02.discount;

import com.example.bookobject.ch02.Money;
import com.example.bookobject.ch02.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
