/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author apire
 */
public  abstract class Material {
    protected String code;
    protected String title;
    protected String year;
    
    public Material(String code, String title, String year){
        this.year=year;
        this.code=code;
        this.title=title;
    }
    public String getCode(){ return code;}
    public String getTitle(){ return title;}
    public String getYear(){ return year;}
    
    public void setCode(String code){ this.code=code;}
    public void setTitle(String title){ this.title=title;}
    public void setYear(String year){ this.year=year;}
}

