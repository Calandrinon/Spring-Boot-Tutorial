package com.noob.springtutorial.repositories;

import com.noob.springtutorial.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author, Long> {
}
