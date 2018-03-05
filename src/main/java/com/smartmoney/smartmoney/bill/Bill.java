package com.smartmoney.smartmoney.bill;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bill implements Serializable {

    private String id;
    private String payee;
    private String title;
    private Date dueDate;
    private long amount;
    private Date paidDate;
    private String payeeLink;

    public Bill() {}

    public Bill(String id, String payee, String title, Date dueDate, String payeeLink) {
        this.id = id;
        this.payee = payee;
        this.title = title;
        this.dueDate = dueDate;
        this.payeeLink = payeeLink;
    }

    public Bill(String id, String payee, String title, Date dueDate, long amount, Date paidDate, String payeeLink) {
        this.id = id;
        this.payee = payee;
        this.title = title;
        this.dueDate = dueDate;
        this.amount = amount;
        this.paidDate = paidDate;
        this.payeeLink = payeeLink;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public String getPayeeLink() {
        return payeeLink;
    }

    public void setPayeeLink(String payeeLink) {
        this.payeeLink = payeeLink;
    }
}
