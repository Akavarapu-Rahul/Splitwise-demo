package com.scaler.Splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Currency;
import java.util.List;

@Getter
@Setter
@Entity(name = "SPLITWISE_GROUP")
public class Group extends BaseModel{
    private String name;
    private String description;
    private double totalAmountSpent;
    private Currency defaultCurrency;
    @OneToMany
    private List<Expense>expenses;
    @ManyToMany
    private List<User> users;
}
