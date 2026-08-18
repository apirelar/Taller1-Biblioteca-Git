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
static void LoanMenu(){
    int op3;
             System.out.println("***** MANAGE LOANS *****");
             System.out.println("1. Create loans");
             System.out.println("2. List loans");
             System.out.println("3. Return loans");
             System.out.println("4. Exit");
             System.out.println("Choose one option");
             op3=readOption();
             
             switch(op3){
                 case 1:
                     CreateLoan();
                     break;
                 case 2:
                     readLoan();
                     break;
                 case 3:
                     returnLoan();
                     break;
                 case 4:
                     break;
                 default:
                     System.out.println("Option not available");
             }  
}
 static void BookMenu(){
     int op2;
     System.out.println("***** MANAGE BOOKS *****");
     System.out.println("1. Create books");
     System.out.println("2. List books");
     System.out.println("3. Search books");
     System.out.println("4. Update books");
     System.out.println("5. Delette books");
     System.out.println("6. Exit");
     System.out.println("Choose one option");
     op2=readOption();
             
             switch(op2){
                 case 1:
                     createBook();
                     break;
                 case 2:
                     listBook();
                     break;
                 case 3:
                     System.out.println("***** Search for a book *****");
                     System.out.println("Enter book code: ");
                     String id=sc.nextLine();
                     SearchBook(id);
                     break;
                 case 4:
                     UpdateBook();
                     break;
                 case 5:
                     DeleteBook();
                     break;
                 case 6:
                     break;
                 default:
                     System.out.println("Option not available");
             }
 }
 static void ClientMenu(){
     int op1;
     System.out.println("***** MANAGE CLIENTS *****");
             System.out.println("1. Create clients");
             System.out.println("2. Read clients");
             System.out.println("3. Search clients");
             System.out.println("4. Update clients");
             System.out.println("5. Delette clients");
             System.out.println("6. Exit");
             System.out.println("Choose one option");
             op1=readOption();
             
             switch(op1){
                 case 1:
                     createClient();
                     break;
                 case 2:
                     ReadClient();
                     break;
                 case 3:
                     System.out.println("***** Search for a client *****");
                     System.out.println("Enter client ID: ");
                     String clientId=sc.nextLine();
                     ReadSearch(clientId);
                     break;
                 case 4:
                     updateClient();
                     break;
                 case 5:
                     DeleteClient();
                     break;
                 case 6:
                     break;
                 default:
                     System.out.println("Option not available");
             }
 }
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
     } 
     if(!found){
             System.out.println("Client not found");
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
    System.out.println("***** Delete for a client *****");
    System.out.println("Enter client ID:");
    String id = sc.nextLine();
    boolean found = clients.removeIf(client -> client.getId().equals(id));
    if(found){
        System.out.println("Client successfully deleted");
    } else {
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
     } 
     if(!found){
             System.out.println("Book not found");
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
    System.out.println("***** Delete for a book *****");
    System.out.println("Enter book code:");
    String code = sc.nextLine();
    boolean found = books.removeIf(book -> book.getCode().equals(code));
    if(found){
        System.out.println("Book successfully deleted");
    } else {
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
       if (client == null) {  
        System.out.println("Client not found. Loan not created.");
        return;
    }
      System.out.println("Enter book  code: ");
      String code=sc.nextLine();
      Book book= SearchBook(code);
      if (book == null) {  // ← Validar libro
        System.out.println("Book not found. Loan not created.");
        return;
    }
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
        if(loan.getStated().equalsIgnoreCase("active")){
            System.out.println(loan);
            active=true;
        }
    }
    if(!active){
        System.out.println("There are no active loans.");
    }
}  
static int readOption(){
    while(true){
        try {
            int op = sc.nextInt();
            sc.nextLine();
            return op;
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number.");
            sc.nextLine();
        }
    }
}
 public static void main(String[] args) {
 int op;
 do{
     System.out.println("***** LIBRARY MANAGEMENT *****");
     System.out.println("1. Manage Clients");
     System.out.println("2. Manage Books");
     System.out.println("3. Manage Loans");
     System.out.println("4. Exit");
     System.out.println("Choose one option");
     op=readOption();
     switch(op){
         case 1:
             ClientMenu();
             break;
         case 2:
             BookMenu();
             break;
        case 3:
            LoanMenu();
            break; 
        case 4:
            return;
        default:
            System.out.println("Option not available");
     }
     
 }while(op!=4);
 }
}