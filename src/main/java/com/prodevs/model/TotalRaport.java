package com.prodevs.model;

import javax.persistence.*;

/**
 * Created by Mateusz on 15.05.2017.
 */

@Entity
@Table(name = "TotalRaport")
public class TotalRaport {

    @Id
    @GeneratedValue
    @Column(name = "total_raport_id")
    private Integer totalRaportId;

    private Integer clients;

    private Integer quantity;

    private Double profit;

    public TotalRaport() {}

    public TotalRaport(Integer clients, Integer quantity, Double profit) {
        this.clients = clients;
        this.quantity = quantity;
        this.profit = profit;
    }

    public Integer getTotalRaportId() {
        return totalRaportId;
    }

    public void setTotalRaportId(Integer totalRaportId) {
        this.totalRaportId = totalRaportId;
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

        TotalRaport that = (TotalRaport) o;

        if (!totalRaportId.equals(that.totalRaportId)) return false;
        if (clients != null ? !clients.equals(that.clients) : that.clients != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        return profit != null ? profit.equals(that.profit) : that.profit == null;
    }

    @Override
    public int hashCode() {
        int result = totalRaportId.hashCode();
        result = 31 * result + (clients != null ? clients.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (profit != null ? profit.hashCode() : 0);
        return result;
    }
}
