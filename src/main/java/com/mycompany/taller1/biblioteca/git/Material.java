/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1.biblioteca.git;

/**
 *
 * @author apire
 */
public  abstract class Material {
    protected String code;
    protected String title;
    protected String anioPublic;
    
    public Material(String code, String tite, String anioPublic){
        this.anioPublic=anioPublic;
        this.code=code;
        this.title=title;
    }
    public String getCode(){ return code;}
    public String getTitle(){ return title;}
    public String getAnioPublic(){ return anioPublic;}
    
    public void setCode(String code){ this.code=code;}
    public void setTitle(String title){ this.title=title;}
    public void setAnioPublic(String anioPublic){ this.anioPublic=anioPublic;}
}

