/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 static ArrayList<Client> clients = new ArrayList<>();
 static ArrayList<Book> books= new ArrayList<>();
 static Scanner sc = new Scanner(System.in);
 
 static void createClient(Client client){
     clients.add(client);
 }
 static void ReadClient(){
     for(Client client: clients){
         System.out.println(client);
     }
 }
 static void ReadSearch(){
     boolean found=false;
     System.out.println("***** Search for a client *****");
     System.out.println("Enter client ID:");
     String id=sc.nextLine();
     for(Client client: clients){
         if (client.getId().equals(id)) {
             System.out.println("Client found");
             System.out.println("Name: "+client.getName());
             System.out.println("Telephone: "+client.getTelephone());
             System.out.println("Email: "+client.getEmail());
             found=true;
         }
         if(!found){
             System.out.println("Client not found");
         }
     } 
 }
 static void updateClient(){
     boolean found=false;
     System.out.println("***** Update for a client *****");
     System.out.println("Enter client ID:");
     String id=sc.nextLine();
     for(Client client: clients){
         if (client.getId().equals(id)) {
             System.out.println("Enter new name");
             String newName=sc.nextLine();
             client.setName(newName);
             System.out.println("Enter new telephone");
             String newTelephone=sc.nextLine();
             client.setTelephone(newTelephone);
             System.out.println("Enter new email");
             String newEmail=sc.nextLine();
             client.setEmail(newEmail);
             found=true;
         }
     }
     if(!found){
             System.out.println("Client not found");
         }
 }
 static void DeleteClient(){
      boolean found=false;
     System.out.println("***** Delete for a client *****");
     System.out.println("Enter client ID:");
     String id=sc.nextLine();
     for(Client client: clients){
         if (client.getId().equals(id)) {
         clients.remove(client);
         found=true;
         }
    }
     if(!found){
         System.out.println("Client not found");
     }
 }
  static void createBook(Book book){
     books.add(book);
 }
  static void listBook(){
       for(Book book: books){
         System.out.println(book);
     }
  }
         
 public static void main(String[] args) {
 // Aquí irá el menú (Fase 8)
 }
}