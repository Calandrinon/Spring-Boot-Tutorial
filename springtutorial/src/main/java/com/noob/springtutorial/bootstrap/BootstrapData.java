package com.noob.springtutorial.bootstrap;

import com.noob.springtutorial.model.Author;
import com.noob.springtutorial.model.Book;
import com.noob.springtutorial.model.Publisher;
import com.noob.springtutorial.repositories.AuthorRepository;
import com.noob.springtutorial.repositories.BookRepository;
import com.noob.springtutorial.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher count:" + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("omain Driven Design", "123125");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");

        Book noEJB = new Book("J2EE", "987654");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("num of books: " + bookRepository.count());
    }
}
