package com.example.bookobject.ch02.discount;

import com.example.bookobject.ch02.Money;
import com.example.bookobject.ch02.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
