package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    /*
    Ici je peux faire une injection meme si je n'ai pas défini encore une implemntation de l'interface dans le projet,
    pour le moment un seul Bean disponible qui implemente l'interface #CrudRepository#, c'est le #SimpleJpaRepository#
    Ce Bean fait partie du starter #spring-boot-starter-data-jpa# qui sera disponible au #runtime#
    @constractor @injection
     */
    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Trabelsi");
        Book book = new Book("Java 8 features", "123456");
        eric.getBooks().add(book);
        book.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book);

        Author fares = new Author("Fares", "Ferchichi");
        Book livre = new Book("Tomcat", "056489");
        fares.getBooks().add(livre);
        livre.getAuthors().add(fares);

        authorRepository.save(fares);
        bookRepository.save(livre);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
