package telran.java52.book.dto;

import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BookDto {

    String isbn;
	String title; 
	Set<AuthorDto> authors;
	String publisher;
}
