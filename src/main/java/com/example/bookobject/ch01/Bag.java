package com.example.bookobject.ch01;

public class Bag {
    private Long amount;
    private Ticket ticket;
    private Invitation invitation;

    public Bag(Long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        this.ticket = ticket;

        if (hasInvitation()) {
            return 0L;
        }

        minusAmount(ticket.getFee());

        return ticket.getFee();
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
