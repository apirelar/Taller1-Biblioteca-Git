/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1.biblioteca.git;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 static ArrayList<Client> clients = new ArrayList<>();
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
     System.out.println("Enter customer ID:");
     String id=sc.nextLine();
     for(Client client: clients){
         if (client.getId().equals(id)) {
             System.out.println("Client found");
             System.out.println("Name: "+client.getName());
             System.out.println("Telephone: "+client.getTelephone());
             System.out.println("Email: "+client.getEmail());
             found=true;
         }
         if(found==false){
             System.out.println("Client not found");
         }
     } 
 }
 public static void main(String[] args) {
 // Aquí irá el menú (Fase 8)
 }
}