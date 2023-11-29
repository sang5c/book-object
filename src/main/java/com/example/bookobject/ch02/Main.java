package com.example.bookobject.ch02;

import com.example.bookobject.ch02.discount.*;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Movie avatar = createAvatar();
        Movie titanic = createTitanic();
        Movie starWars = createStarWars();
    }

    private static Movie createStarWars() {
        DiscountPolicy discountPolicy = new NoneDiscountPolicy();
        return new Movie("스타워즈", Duration.ofMinutes(210), Money.wons(10000), discountPolicy);
    }

    private static Movie createAvatar() {
        DiscountCondition[] discountConditions = {
                new SequenceCondition(1),
                new SequenceCondition(10),
                new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))
        };

        DiscountPolicy discountPolicy = new AmountDiscountPolicy(Money.wons(800), discountConditions);
        return new Movie("아바타", Duration.ofMinutes(120), Money.wons(10000), discountPolicy);
    }

    private static Movie createTitanic() {
        DiscountCondition[] discountConditions = {
                new PeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                new SequenceCondition(2),
                new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59))
        };

        DiscountPolicy discountPolicy = new PercentDiscountPolicy(0.1, discountConditions);
        return new Movie("타이타닉", Duration.ofMinutes(180), Money.wons(11000), discountPolicy);
    }
}
