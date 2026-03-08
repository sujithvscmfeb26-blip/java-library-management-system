package com.Library.management;

import com.Library.Exceptions.BookNotFoundException;
import com.Library.Exceptions.DuplicateBookException;
import com.Library.Exceptions.NegativeValueException;
import com.Library.Exceptions.NumericValueFieldException;

public abstract class LibraryOperations {
	
	public abstract  void AddBooks() throws DuplicateBookException, NegativeValueException, NumericValueFieldException;
	public abstract  void EditBooks() throws NegativeValueException;
	public abstract void DeleteBook();
	public abstract void SearchBooks() throws BookNotFoundException;
	public abstract void SortBooksbyTitle();
	public abstract void SortBooksbyAuthor();
	public abstract void SortBooksbyRating();
	public abstract void SortBooksbyPrice();
	public abstract void SortBooksbyYear();
	
}
