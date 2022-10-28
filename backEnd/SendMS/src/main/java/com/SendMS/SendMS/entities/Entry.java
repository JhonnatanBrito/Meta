/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SendMS.SendMS.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jhonn
 */
@Entity   // anotação que define relação com tabela do banco
@Table(name = "tb_sales") // anotação que relaciona com a tabela "tb_sales" do banco
public class Entry {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;               // id do Banco
   
   private String sellerName;    //Nome do Vendedor
   private Integer visited;      // Numero de Visitas
   private Integer deals;            // Vendas
   private Double amount;          //Total de Vendas
   private LocalDate date ;          // data 
   
   public Entry(){
   
   }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    
    
}
