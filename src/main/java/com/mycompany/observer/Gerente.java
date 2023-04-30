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
public class Gerente implements Observer {

private String nome;
public Gerente(){};
public Gerente(String nome) {
this.nome = nome;
    
}

@Override
public void update(Estoque estoque) {BigDecimal valor = estoque.getValor();BigDecimal limite = new BigDecimal("1000.0");
if (valor.compareTo(limite) > 0) {
System.out.println("Gerente " + nome + ": Valor doproduto " + estoque.getProduto() + " é maior que 1000.");
} 

}

}