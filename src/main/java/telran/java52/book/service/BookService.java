package telran.java52.book.service;



import telran.java52.book.dto.AuthorDto;
import telran.java52.book.dto.BookDto;
import telran.java52.book.model.Publisher;


public interface BookService {
	
	Boolean addBook (BookDto bookDto);
	
	BookDto findBookByIsbn (String isbn);
	
	BookDto removeBook (String isbn);
	
	BookDto updateBookTitle (String isbn, String title);
	
	BookDto [] findBooksByAuthor (String authorName);
	
	BookDto [] findBooksByPublisher (String publisherName);
	
	AuthorDto [] findBookAuthors (String isbn);
	
	Iterable<Publisher> findPublishersByAuthor (String authorName);
	
	AuthorDto removeAuthor (String authorName);
	
}
