package com.Library.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import com.Library.Exceptions.*;
import java.util.Scanner;
import com.Library.model.Books;


public class InventoryManager {
	
	
		Books B = new Books();
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Books> blist=new ArrayList<Books>();

	    public InventoryManager(){
	    

	    blist.add(new Books(101,"Atomic Habits","James",2014,1999,2));
	    blist.add(new Books(202,"You cant see me","John",2014,6999,5));
	    blist.add(new Books(104,"where we meet","Romeo",2014,7999,3));
	    blist.add(new Books(106,"Suuuiiii","Ronaldo",2014,2999,1));
	    blist.add(new Books(103,"Alien Lifes","Messi",2014,999,4));
	    
	    }
	    
	    
	    public void ShowBooks(){
	    	
	    	System.out.println("\n==================== BOOKS DETAILS =====================\n");
	    	blist.stream().forEach(b->System.out.println(b));
	    	
	    }
	     
	    
	    
	    public void AddBooks() throws DuplicateBookException, NegativeValueException, NumericValueFieldException{ {
	    	
	    		Books b = new Books();
	    		int bookId;
	    		System.out.println("Enter the Book Id:");
	    		
	    		try {
	    			bookId = sc.nextInt();
        	    }catch (InputMismatchException ex) {
        	    	sc.next();
        	    	throw new NumericValueFieldException("Numeric Values Only. Try Again!!");
        	    }
	    		
	    		if (blist.stream().anyMatch(ba -> ba.getBookId() == bookId)) {
	    			throw new DuplicateBookException("Duplicate BookId , Try new Id.");
	    		}
	    		else
	    		{
	    			b.setBookId(bookId);
	    			
	    		}
	    		System.out.println("Enter the title:");
 	            B.setTitle(sc.next());
 	            System.out.println("Enter the Author:");
 	            B.setAuthor(sc.next());
 	            System.out.println("Enter the price:");
        	    try {
        	    	double price=sc.nextDouble();
        	    	B.setPrice(price);
        	    }catch (InputMismatchException ex) {
        	    	sc.next();
        	    	throw new NumericValueFieldException("Numeric Values Only. Try Again!!");
        	    }
 	            System.out.println("Enter the Year:");
 	            B.setYear(sc.nextInt());
 	            System.out.println("Enter the Rating ");
 	            B.setRating(sc.nextInt());   
 	            blist.add(B);
 	            System.out.println("Entered data succesfully!");
 	            
	           
	        }
	    }
	    
	    
	    public void EditBooks() throws NegativeValueException {
	    	
	    	boolean flag = false;
	    	System.out.println("Enter the Book Id:");
            int Bid = sc.nextInt();
            
            
            
            for (Books b:blist) {
            	if(Bid == b.getBookId()) {
            		flag = true;
            	    System.out.println("Enter the title:");
      	            b.setTitle(sc.next());
      	            System.out.println("Enter the Author:");
      	            b.setAuthor(sc.next());
      	            System.out.println("Enter the price:");
      	            b.setPrice(sc.nextDouble());
      	            System.out.println("Enter the Year:");
      	            b.setYear(sc.nextInt());
      	            System.out.println("Enter the rating:");
					b.setRating(sc.nextInt());
      	            System.out.println("Entered data succesfully!");
      	        }
            
            
            }
            if (flag == false) {
            	System.out.println("Record Not Found");	
            }
	    } //edit book close.
	    
	    
	    public void DeleteBook() {
	    	
	    	boolean flag = false;
	    	System.out.println("Enter the Book Id:");
            int Bid = sc.nextInt();
            
            for (Books b:blist) {
            	if(Bid == b.getBookId()) {
            		flag = true;
            		blist.remove(b);
            		System.out.println("Book Deleted from the Libarary");
            		break;
            	}
            }
            if (flag == false) {
            	System.out.println("Record Not Found");	
            }
	    }//delete book closes.
	    
	    public void SearchBooks() throws BookNotFoundException {
	    	boolean flag = false;
	    	System.out.println("Enter the Book Id:");
            int Bid = sc.nextInt();
            
            for (Books b:blist) {
            	if(Bid == b.getBookId()) {
            		flag = true;
            		System.out.println("\n==================== BOOK DETAILS =====================\n");
            		System.out.println(b);
            		break;
            	}
            }
            if (flag == false) {
            	//System.out.println("Record Not Found");	
            	throw new BookNotFoundException("record not found!");
            }
	    	
	    }//closes SearchBook


		public void SortBooksbyTitle() {
			System.out.println("\n=================== SORTED LIST BASED ON TITLE ===================\n");
			
			Comparator<Books> sortByTitle = new Comparator<Books>() {
				
				@Override
				public int compare(Books o1, Books o2) {
					// TODO Auto-generated method stub
					return o1.getTitle().compareTo(o2.getTitle());
				}
			};
			Collections.sort(blist,sortByTitle);
			blist.stream().forEach(b -> System.out.println(b));
//			
		}// SortBooksbyTitle closed


		public void SortBooksbyAuthor() {
			System.out.println("\n=================== SORTED LIST BASED ON AUTHOR===================\n");
				Comparator<Books> sortByAuthor = new Comparator<Books>() {

					@Override
					public int compare(Books o1, Books o2) {
						return o1.getAuthor().compareTo(o2.getAuthor());
					}
				};
				Collections.sort(blist,sortByAuthor);
				
				blist.stream().forEach(e->System.out.println(e));
			
		}//SortBooksbyAuthor closed


		public void SortBooksbyRating() {
			System.out.println("\n=================== SORTED LIST BASED ON RATING  ====================\n");
			Comparator<Books> sortByRating = new Comparator<Books>() {
				
				@Override
				public int compare(Books o1, Books o2) {
					return Integer.compare(o2.getRating(), o1.getRating());
				}
			};
			
			Collections.sort(blist,sortByRating);
			
			blist.stream().forEach(b->System.out.println(b));
		}//SortBooksbyRating closed.


		public void SortBooksbyPrice() {
			System.out.println("\n=================== SORTED LIST BASED ON PRICE ===================\n");
			Comparator<Books> sortByPrice = new Comparator<Books>() {
				
				@Override
				public int compare(Books o1, Books o2) {
					return Double.compare(o1.getPrice(), o2.getPrice());
				}
			};
			Collections.sort(blist,sortByPrice);
			
			blist.stream().forEach(b->System.out.println(b));
			
		}//  SortBooksbyPrice closed.


		public void SortBooksbyYear() {
			System.out.println("\n=================== SORTED LIST BASED ON YEAR ===================\n");
				Comparator<Books> sortByYear = new Comparator<Books>() {
					
					@Override
					public int compare(Books o1, Books o2) {
						return Integer.compare(o1.getYear(), o2.getYear());
					}
				};
				Collections.sort(blist,sortByYear);
				blist.stream().forEach(b->System.out.println(b));
			
		}//SortBooksbyYear CLOSED.
		
		
	    	
}// class close.

	
	
	


