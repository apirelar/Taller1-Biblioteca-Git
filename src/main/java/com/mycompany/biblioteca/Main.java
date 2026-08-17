/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
 static ArrayList<Client> clients = new ArrayList<>();
 static ArrayList<Book> books= new ArrayList<>();
 static ArrayList<Loan> loans= new ArrayList<>();
 static Scanner sc = new Scanner(System.in);
 
 static void createClient(){
      System.out.println("***** Create for a client *****");
    System.out.print("Enter client Id: ");
    String id = sc.nextLine();
    System.out.print("Enter client Name: ");
    String name = sc.nextLine();
    System.out.print("Enter client Telephone: ");
    String telephone = sc.nextLine();
    System.out.print("Enter client Email: ");
    String email = sc.nextLine();

    Client client = new Client(id, name, telephone, email);
    clients.add(client);
    System.out.println("Client successfully created");
 }
 static void ReadClient(){
     for(Client client: clients){
         System.out.println(client);
     }
 }
 static Client ReadSearch(String id){
     boolean found=false;
     System.out.println("***** Search for a client *****");
     for(Client client: clients){
         if (client.getId().equals(id)) {
             System.out.println("Client found");
             System.out.println("Name: "+client.getName());
             System.out.println("Telephone: "+client.getTelephone());
             System.out.println("Email: "+client.getEmail());
             found=true;
             return client;
         }
         if(!found){
             System.out.println("Client not found");
         }
     } 
     return null;
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
             System.out.println("Client successfully updated");
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
             System.out.println("Client successfully deleted");
         }
    }
     if(!found){
         System.out.println("Client not found");
     }
 }
  static void createBook(){
       System.out.println("***** Create for a book *****");
    System.out.print("Enter book Code: ");
    String code = sc.nextLine();
    System.out.print("Enter book Title: ");
    String title = sc.nextLine();
    System.out.print("Enter book Author: ");
    String author = sc.nextLine();
    System.out.print("Enter book year publication: ");
    String year = sc.nextLine();

    Book book = new Book(code, title, year, author);
    books.add(book);
    System.out.println("Book successfully created");
 }
  static void listBook(){
       for(Book book: books){
         System.out.println(book);
     }
  }
  static Book SearchBook(String code){
     boolean found=false;
     System.out.println("***** Search for a Book *****");
     for(Book book: books){
         if (book.getCode().equals(code)) {
             System.out.println("Book found");
             System.out.println("Name: "+book.getTitle());
             System.out.println("Author: "+book.getAuthor());
             System.out.println("Year Publication: "+book.getYear());
             System.out.println("Available: "+(book.isAvailable() ? "Si":"No"));
             found=true;
             return book;
         }
         if(!found){
             System.out.println("Book not found");
         }
     } 
     return null;
  }
  static void UpdateBook(){
      boolean found=false;
     System.out.println("***** Update for a Book *****");
     System.out.println("Enter book code:");
     String code=sc.nextLine();
     for(Book book: books){
         if (book.getCode().equals(code)) {
             System.out.println("Enter new Title");
             String newName=sc.nextLine();
             book.setTitle(newName);
             System.out.println("Enter new Author");
             String newAuthor=sc.nextLine();
             book.setAuthor(newAuthor);
             System.out.println("Enter new Year Publication");
             String newYear=sc.nextLine();
             book.setYear(newYear);
             found=true;
             System.out.println("Book successfully updated");
         }
     }
     if(!found){
             System.out.println("Book not found");
         }
  }
  static void DeleteBook(){
      boolean found=false;
     System.out.println("***** Delete for a book *****");
     System.out.println("Enter book code:");
     String code=sc.nextLine();
     for(Book book: books){
         if (book.getCode().equals(code)) {
         books.remove(book);
         found=true;
             System.out.println("Book successfully deleted");
         }
    }
     if(!found){
         System.out.println("Book not found");
     }
 }
  static void CreateLoan(){
      System.out.println("***** Create for a loan *****");
      System.out.println("Enter loan  ID: ");
      String idLoan=sc.nextLine();
      System.out.println("Enter client  ID: ");
      String idClient=sc.nextLine();
      Client client=ReadSearch(idClient);
      System.out.println("Enter book  code: ");
      String code=sc.nextLine();
      Book book= SearchBook(code);
      if (!book.isAvailable()) {
          System.out.println("Book not available");
          return;
      }
      Loan loan=new Loan(idLoan,client,book, LocalDate.now());
      loans.add(loan);
      book.setAvailable(false);
      System.out.println("Loan successfully created");
  }
  static Loan SearchLoan(String idLoan){
       for (Loan loan : loans) {
        if (loan.getIDLoan().equalsIgnoreCase(idLoan)) {
            return loan;
        }
    }
    return null;
  } 
  static void returnLoan(){
      System.out.println("***** Return for a loan *****");
      System.out.println("Enter loan ID: ");
      String idlo=sc.nextLine();
      Loan loan=SearchLoan(idlo);
      if(loan==null){
          System.out.println("Loan not found");
          return;
      }
      if (loan.getStated().equals("returned")) {
        System.out.println("This Loan has already been repaid.");
        return;
    }
      loan.setStated("returned");
      loan.getBook().setAvailable(true);
      
      System.out.println("Loan successfully returned"); 
  }
static  void readLoan(){
    boolean active=false;
    for(Loan loan: loans){
        if(loan.getStated().equals("active")){
            System.out.println(loan);
            active=false;
        }
    }
    if(!active){
        System.out.println("There are no active loans.");
    }
}  
 public static void main(String[] args) {
 // Aquí irá el menú (Fase 8)
 }
}