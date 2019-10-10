package com.caseStudy.eCart.models;

import javax.persistence.*;
@Entity
@Table( name = "usercart")
public class Cart {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id ;

    @ManyToOne
    private Products items ;
    @ManyToOne
    private Authorization user ;
    @Column( name =  "quantity ")
    private int quantity;
    public Cart( com.caseStudy.eCart.models.Products items, com.caseStudy.eCart.models.Authorization user , int quantity)
    {
        this.items = items ;
        this.user = user ;
        this.quantity = quantity ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Products getItems() {
        return items;
    }

    public void setItems(Products items) {
        this.items = items;
    }

    public Authorization getUser() {
        return user;
    }

    public void setUser(Authorization user) {
        this.user = user;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
