package com.prodevs.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by Krzysztof on 2017-05-15.
 */
@Entity
public class DailyRaport {

    @Id
    @GeneratedValue
    @Column(name = "daily_raport_id")
    private Integer dailyRaportId;

    private Date date;

    private Time time;

    private Integer clients;

    private Integer quantity;

    private Double profit;



    public DailyRaport(){

    }

    public DailyRaport(Date date, Time time, Integer clients, Integer quantity, Double profit) {
        this.date = date;
        this.time = time;
        this.clients = clients;
        this.quantity = quantity;
        this.profit = profit;
    }



    public Integer getDailyRaportId() {
        return dailyRaportId;
    }

    public void setDailyRaportId(Integer dailyRaportId) {
        this.dailyRaportId = dailyRaportId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Integer getClients() {
        return clients;
    }

    public void setClients(Integer clients) {
        this.clients = clients;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DailyRaport that = (DailyRaport) o;

        if (!dailyRaportId.equals(that.dailyRaportId)) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (clients != null ? !clients.equals(that.clients) : that.clients != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        return profit != null ? profit.equals(that.profit) : that.profit == null;
    }

    @Override
    public int hashCode() {
        int result = dailyRaportId.hashCode();
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (clients != null ? clients.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (profit != null ? profit.hashCode() : 0);
        return result;
    }
}
