/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1.biblioteca.git;

/**
 *
 * @author apire
 */
public class Client extends Person{
     private String email;
    public Client(String id, String name, String telephone, String email) {
        super(id, name, telephone);
        this.email=email;
    }
    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}
    
}
