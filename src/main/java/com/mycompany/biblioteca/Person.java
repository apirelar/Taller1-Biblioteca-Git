/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author apire
 */
public abstract class Person {
    protected String id;
    protected String name;
    protected String  telephone;
    
    public Person(String id,String name, String telephone ){
        this.id=id;
        this.name=name;
        this.telephone=telephone;
    }
    
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getTelephone(){
        return telephone;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }
}
