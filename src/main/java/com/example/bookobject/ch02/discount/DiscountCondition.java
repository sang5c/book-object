package com.example.bookobject.ch02.discount;

import com.example.bookobject.ch02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
