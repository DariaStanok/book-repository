package telran.java52.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java52.book.model.Book;
import telran.java52.book.model.Publisher;

public interface BookRepository {

	Stream<Book> findByAuthorsName(String name);
	
	Stream<Book> findByPublisherPublisherName(String publisherName);
	
	void deleteByAuthorsName(String name);
	
	boolean existsById (String isbn);

	Book save(Book book);

	Optional<Book> findById(String isbn);

	void delete(Book book);
}
