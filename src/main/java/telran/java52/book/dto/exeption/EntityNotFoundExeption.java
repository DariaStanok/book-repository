package telran.java52.book.dto.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundExeption extends RuntimeException {

	private static final long serialVersionUID = -4384822795371513503L;

}
