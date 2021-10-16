package com.study.object.theater.domain;

/**
 * 가방을 맏아 둔다.
 */
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    /**
     * 현금만 보관
     * @param amount
     */
    public Bag(long amount){
        this(null, amount);
    }

    /**
     * 초대장과 현금만 보관
     * @param ticket
     * @param amount
     */
    public Bag(Ticket ticket, Long amount){
        this.ticket = ticket;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket(){
        return ticket !=null;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAomunt(Long amount){
        this.amount += amount;
    }
}
