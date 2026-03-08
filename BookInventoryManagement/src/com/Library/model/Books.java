package com.Library.model;

import com.Library.Exceptions.NegativeValueException;

public class Books {
		private int  bookId;
	    private String title;
	    private String author;
	    private int publicationYear;
	    private double price;
	    private int rating;
	    
	    public Books() {
	    	
	    }


	    public Books (int bookId ,String title,String author,int publicationYear,double price,int rating){
	    	this.bookId = bookId;
	        this.title=title;
	        this.author=author;
	        this.publicationYear = publicationYear;
	        this.price = price;
	        this.rating = rating;
	    }

	    public String getTitle(){
	        return this.title;
	    }
	    public String getAuthor(){
	        return this.author;
	    }
	    public int getYear(){
	        return this.publicationYear;
	    }
	    public double getPrice(){
	        return this.price;
	    }
	    public int getRating(){
	        return this.rating;
	    }
	    public int getBookId() {
			return bookId;
		}
	

	    public void setTitle(String title){
	        this.title=title;
	    }
	    public void setAuthor(String author){
	        this.author=author;
	    }
	    public void setYear(int publicationYear){
	        this.publicationYear=publicationYear;
	    }
	    public void setPrice(double price) throws NegativeValueException {
	    	
	    	if(price <0) {
	            	throw new NegativeValueException("Negative Values not allowed");
	            }
	            else {
	            	this.price=price;
	            } 
	        
	    }
	    public void setRating(int rating) throws NegativeValueException{
	    	
	    	if(rating <0) {
            	throw new NegativeValueException("Negative Values not allowed");
            }
            else {
            	this.rating=rating;
            } 
        
    }

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		
	    
	    
	    public String toString() {
	    	return "Book id : "+bookId+"| Book Title : " + title + "| Author : " + author +"| Year : " +publicationYear + "| Price : " +price+ "| Rating : "+rating;
	    }


}
