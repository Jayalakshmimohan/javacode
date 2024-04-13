package presentation;

import businessLogic.CallDetailsPresenter;
import businessLogic.InvoiceGenerator;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     CallDetailsPresenter callDetailsPresenter = new CallDetailsPresenter();
     InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

     int choice;
         System.out.println("Welcome to Telecom Billing System");
         System.out.println("Enter your choice:");
         System.out.println("1. View Call Details");
         System.out.println("2. Generate Invoice");
         System.out.println("3. Exit");
         choice = scanner.nextInt();
         switch (choice) {
             case 1:
                 System.out.println("Displaying Call Details...");
                 callDetailsPresenter.displayCallDetails();
                 break;
             case 2:
                 System.out.println("Generating Invoice...");
                 invoiceGenerator.generateInvoice();
                 break;
             case 3:
                 System.out.println("Exiting...");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     while(choice!=3);scanner.close();
}}
