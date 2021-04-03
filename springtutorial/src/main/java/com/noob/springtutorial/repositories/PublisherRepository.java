package com.noob.springtutorial.repositories;

import com.noob.springtutorial.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
