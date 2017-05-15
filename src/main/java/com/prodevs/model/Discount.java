package com.prodevs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Krzysztof on 2017-05-15.
 */
@Entity
public class Discount {

    @Id
    @Column(name = "discount_id")
    @GeneratedValue
    private Integer discountId;

    private String type;

    private Integer value;


    public Discount() {
    }

    public Discount(String type, Integer value) {
        this.type = type;
        this.value = value;
    }


    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Discount discount = (Discount) o;

        if (!discountId.equals(discount.discountId)) return false;
        if (type != null ? !type.equals(discount.type) : discount.type != null) return false;
        return value != null ? value.equals(discount.value) : discount.value == null;
    }

    @Override
    public int hashCode() {
        int result = discountId.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

}
