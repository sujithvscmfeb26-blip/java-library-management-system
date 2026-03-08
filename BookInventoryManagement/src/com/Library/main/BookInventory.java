package com.Library.main;

import java.util.Scanner;

import com.Library.Exceptions.BookNotFoundException;
import com.Library.Exceptions.DuplicateBookException;
import com.Library.Exceptions.NegativeValueException;
import com.Library.Exceptions.NumericValueFieldException;
import com.Library.manager.InventoryManager;
//import com.Library.model.Books;

public class BookInventory {
	
	
			public static void main(String args[])  {
				
				Scanner sc = new Scanner(System.in);
				InventoryManager im = new InventoryManager();
				//Books b = new Books();
				
				
				boolean flag = true;
		        do {
		        	System.out.println();
		        	System.out.println("=================== BOOK INVENTORY SYSTEM ===================");
		            System.out.println("1. Add Book");
		            System.out.println("2. Search Book");
		            System.out.println("3. Sort by Title");
		            System.out.println("4. Sort by Author");
		            System.out.println("5. Sort by Rating");
		            System.out.println("6. Sort by Price");
		            System.out.println("7. Sort by Year");
		            System.out.println("8. Edit details");
		            System.out.println("9. Show details");
		            System.out.println("10. Exit");
		            System.out.println("enter your choice :");
		            int choice = sc.nextInt();


		            switch (choice){
		                case 1:
						try {
							im.AddBooks();
						} catch (DuplicateBookException | NegativeValueException | NumericValueFieldException e) {
							// TODO Auto-generated catch block
							System.out.println(e.getMessage());
						}
		                     break;
		                case 2:{
		                    try {
								im.SearchBooks();
							} catch (BookNotFoundException e) {
								// TODO Auto-generated catch block
								System.out.println(e.getMessage());
							}
		                    break;
		                }
		                case 3:{
		                	im.SortBooksbyTitle();
		                    break;
		                }
		                case 4:{
		                	im.SortBooksbyAuthor();
		                    break;
		                }
		                case 5:{
		                	im.SortBooksbyRating();
		                    break;
		                }
		                case 6:{
		                		im.SortBooksbyPrice();
		                		break;
		                }
		                case 7:{
		                	im.SortBooksbyYear();
		                    break;
		                }
		                case 8 :{
							try {
								im.EditBooks();
							} catch (NegativeValueException e) {
								// TODO Auto-generated catch block
								System.out.println(e.getMessage());
							}
		                     break;
		                }
		                   
		                case 9 :{
		                   im.ShowBooks();
		                    break;
		                    }
		                case 10 :
		                    flag = false;
		                    System.out.println("Exiting....");
		                    break;
		                default :
		                    System.out.println("invalid input ");
		                    break;

		            }
		        } while(flag);
		        sc.close();
		    }
				
	
}
