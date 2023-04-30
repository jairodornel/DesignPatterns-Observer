/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

import java.math.BigDecimal;
import java.util.List;
import java.util.Observer;

/**
 *
 * @author Admin
 */
public class Estoque {
    private String produto;
    private BigDecimal valor; 
    private BigDecimal desconto;
    private List<Observer> observers = newArrayList<Observer>();
    private List<Observer> Observer;
    private List<Observer> newArrayList;
    
public Estoque(){};
public Estoque(String produto,BigDecimal valor, BigDecimal desconto) {
this.produto = produto;
this.valor = valor;
this.desconto = desconto;
}

public void attach(Observer observer) {
observers.add(observer);}
    

public void notifyObservers() {
    observers.forEach(observer -> {
        observer.update(this);
        });
}

    BigDecimal getValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 