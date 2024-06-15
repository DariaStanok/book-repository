package telran.java52.book.service;



import telran.java52.book.dto.AuthorDto;
import telran.java52.book.dto.BookDto;



public interface BookService {
	
	Boolean addBook (BookDto bookDto);
	
	BookDto findBookByIsbn (String isbn);
	
	BookDto removeBook (String isbn);
	
	BookDto updateBookTitle (String isbn, String title);
	
	AuthorDto removeAuthor (String authorName);
	
	Iterable<BookDto> findBooksByAuthor (String authorName);
	
	Iterable<BookDto>  findBooksByPublisher (String publisherName);

	Iterable<AuthorDto>  findBookAuthors (String isbn);
	
	Iterable<String> findPublishersByAuthor (String authorName);
	
}
