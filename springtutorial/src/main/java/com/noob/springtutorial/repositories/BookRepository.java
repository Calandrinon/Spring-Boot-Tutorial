package com.noob.springtutorial.repositories;

import com.noob.springtutorial.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
