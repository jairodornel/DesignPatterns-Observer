/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
BigDecimal valorInicial = new BigDecimal("1900.0");BigDecimal desconto = new BigDecimal("10.0");
Gerente gerente = new Gerente("João");
Estoque estoque = new Estoque("Camiseta", valorInicial,
desconto);
estoque.attach(gerente);
estoque.setValor(valorInicial);
}
    
}
