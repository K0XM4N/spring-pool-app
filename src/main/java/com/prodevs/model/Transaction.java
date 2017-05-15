package com.prodevs.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by Mateusz on 15.05.2017.
 */

@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    @GeneratedValue
    @Column(name = "transaction_id")
    private Integer transactionId;

    private Date date;

    private Time time;

    private Double cost;

    @Column(name = "client_cash")
    private Double clientCash;

    private Double rest;

    @Column(name = "time_in")
    private Time timeIn;

    @Column(name = "time_out")
    private Time timeOut;

    private Boolean status;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;


    Transaction() {}

    public Transaction(Date date, Time time, Double cost, Double clientCash, Double rest, Time timeIn, Time timeOut, Boolean status) {
        this.date = date;
        this.time = time;
        this.cost = cost;
        this.clientCash = clientCash;
        this.rest = rest;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.status = status;
    }


    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getClientCash() {
        return clientCash;
    }

    public void setClientCash(Double clientCash) {
        this.clientCash = clientCash;
    }

    public Double getRest() {
        return rest;
    }

    public void setRest(Double rest) {
        this.rest = rest;
    }

    public Time getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(Time timeIn) {
        this.timeIn = timeIn;
    }

    public Time getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Time timeOut) {
        this.timeOut = timeOut;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (!transactionId.equals(that.transactionId)) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;
        if (clientCash != null ? !clientCash.equals(that.clientCash) : that.clientCash != null) return false;
        if (rest != null ? !rest.equals(that.rest) : that.rest != null) return false;
        if (timeIn != null ? !timeIn.equals(that.timeIn) : that.timeIn != null) return false;
        if (timeOut != null ? !timeOut.equals(that.timeOut) : that.timeOut != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return employee.equals(that.employee);
    }

    @Override
    public int hashCode() {
        int result = transactionId.hashCode();
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (clientCash != null ? clientCash.hashCode() : 0);
        result = 31 * result + (rest != null ? rest.hashCode() : 0);
        result = 31 * result + (timeIn != null ? timeIn.hashCode() : 0);
        result = 31 * result + (timeOut != null ? timeOut.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + employee.hashCode();
        return result;
    }
}
