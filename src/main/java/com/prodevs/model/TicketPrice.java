package com.prodevs.model;


import javax.persistence.*;

/**
 * Created by Mateusz on 15.05.2017.
 */

@Entity
@Table(name="TicketPrice")
public class TicketPrice {

    @Id
    @GeneratedValue
    @Column(name = "ticket_price_id")
    private Integer ticketPriceId;

    private Double weekend;

    @Column(name = "working_week")
    private Double workingWeek;

    public TicketPrice() {}

    public TicketPrice(Double weekend, Double workingWeek) {
        this.weekend = weekend;
        this.workingWeek = workingWeek;
    }

    public Integer getTicketPriceId() {
        return ticketPriceId;
    }

    public void setTicketPriceId(Integer ticketPriceId) {
        this.ticketPriceId = ticketPriceId;
    }

    public Double getWeekend() {
        return weekend;
    }

    public void setWeekend(Double weekend) {
        this.weekend = weekend;
    }

    public Double getWorkingWeek() {
        return workingWeek;
    }

    public void setWorkingWeek(Double workingWeek) {
        this.workingWeek = workingWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketPrice that = (TicketPrice) o;

        if (!ticketPriceId.equals(that.ticketPriceId)) return false;
        if (weekend != null ? !weekend.equals(that.weekend) : that.weekend != null) return false;
        return workingWeek != null ? workingWeek.equals(that.workingWeek) : that.workingWeek == null;
    }

    @Override
    public int hashCode() {
        int result = ticketPriceId.hashCode();
        result = 31 * result + (weekend != null ? weekend.hashCode() : 0);
        result = 31 * result + (workingWeek != null ? workingWeek.hashCode() : 0);
        return result;
    }
}
