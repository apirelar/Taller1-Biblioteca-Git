/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author apire
 */
public class Book extends Material{
    private String author;
    private boolean available;
    public Book(String code, String title, String year,String author ) {
        super(code, title, year);
        this.author=author;
        this.available=true;
    }
    public String getAuthor(){return author;}
    public boolean isAvailable(){return available;}
    
    public void  setAuthor(String author){this.author=author;}
    public void  setAvailable(boolean available){this.available=available;}
    
}   
