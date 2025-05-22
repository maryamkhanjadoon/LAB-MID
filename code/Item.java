/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchui;

public class Item {
    private String name;
    private double price;
    private String store;

    public Item(String name, double price, String store) {
        this.name = name;
        this.price = price;
        this.store = store;
    }

    @Override
    public String toString() {
        return name + " from " + store + " - $" + price;
    }
}