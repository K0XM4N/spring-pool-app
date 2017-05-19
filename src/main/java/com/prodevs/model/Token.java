package com.prodevs.model;

import org.apache.catalina.LifecycleState;
import org.hibernate.type.BooleanType;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Mateusz on 15.05.2017.
 */

@Entity
@Table(name = "Token")
public class Token {

    @Id
    @GeneratedValue
    @Column(name = "token_id")
    private Integer tokenId;

    @Column(name = "is_used")
    private Boolean isUsed;

    @OneToMany(mappedBy = "tokenId")
    private List<Transaction> transaction;

    public Token() {}

    public Token(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public Boolean getUsed() {
        return isUsed;
    }

    public void setUsed(Boolean used) {
        isUsed = used;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Token token = (Token) o;

        if (!tokenId.equals(token.tokenId)) return false;
        if (isUsed != null ? !isUsed.equals(token.isUsed) : token.isUsed != null) return false;
        return transaction != null ? transaction.equals(token.transaction) : token.transaction == null;
    }

    @Override
    public int hashCode() {
        int result = tokenId.hashCode();
        result = 31 * result + (isUsed != null ? isUsed.hashCode() : 0);
        result = 31 * result + (transaction != null ? transaction.hashCode() : 0);
        return result;
    }
}
