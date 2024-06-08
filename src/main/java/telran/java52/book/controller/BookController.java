package telran.java52.book.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java52.book.dto.AuthorDto;
import telran.java52.book.dto.BookDto;
import telran.java52.book.model.Publisher;
import telran.java52.book.service.BookService;

@RestController
@RequiredArgsConstructor
public class BookController  {
	final BookService bookService;

	@PostMapping("/book")
	public Boolean addBook(@RequestBody BookDto bookDto) {
		return bookService.addBook(bookDto);
	}

	@GetMapping("/book/{isbn}")
	public BookDto findBookByIsbn(@PathVariable String isbn) {
		return bookService.findBookByIsbn(isbn);
	}

	@DeleteMapping("/book/{isbn}")
	public BookDto removeBook(@PathVariable String isbn) {
		return bookService.removeBook(isbn);
	}

	@PutMapping("/book/{isbn}/title/{title}")
	public BookDto updateBookTitle(@PathVariable String isbn, @PathVariable String title) {
		return bookService.updateBookTitle(isbn, title);
	}

	@GetMapping("books/author/{authorName}")
	public BookDto[] findBooksByAuthor(@PathVariable String authorName) {
		 return bookService.findBooksByAuthor(authorName);
	}

	@GetMapping("/books/publisher/{publisherName}")
	public BookDto[] findBooksByPublisher(String publisherName) {
		 return bookService.findBooksByPublisher(publisherName);
	}

	@GetMapping("/authors/book/{isbn}")
	public AuthorDto[] findBookAuthors(@PathVariable String isbn) {
		 return bookService.findBookAuthors(isbn);
	}

	@GetMapping("/publishers/author/{authorName}")
	public Iterable<Publisher> findPublishersByAuthor(@PathVariable String authorName) {
		return bookService.findPublishersByAuthor(authorName);
	}

	@DeleteMapping("/author/{authorName}")
	public AuthorDto removeAuthor(@PathVariable String authorName) {
		 return bookService.removeAuthor(authorName);
	}
	
	
	
}