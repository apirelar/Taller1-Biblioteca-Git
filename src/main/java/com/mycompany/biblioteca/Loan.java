/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;
import java.time.LocalDate;
/**
 *
 * @author apire
 */
public class Loan {
    private String idLoan;
    private Client client;
    private Book book;
    private LocalDate date;
    private String stated;
    
    public Loan(String idLoan,Client client,Book book,LocalDate date ){
        this.idLoan=idLoan;
        this.client=client;
        this.book=book;
        this.date=date;
        this.stated="Active";
    }
    public String getIDLoan(){return idLoan;}
    public Client getClient(){return client;}
    public Book getBook(){return book;}
    public LocalDate getDate(){return date;}
    public String getStated(){return stated;}
    
    public void setIDLoan(String idLoan){this.idLoan=idLoan;}
    public void setClient(Client client){this.client=client;}
    public void setBook(Book book){this.book=book;}
    public void setDate(LocalDate date){this.date=date;}
    public void setStated(String stated){this.stated=stated;}
}
