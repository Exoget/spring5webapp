package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;


//Design pattern pour l'acces aux donnees ( persistance et query operations )
//Interface qui contient les operations de bases ( ajout, modification , suppresion , recherche ...)
//Lors du #runtime# spring fourni une implemntation pour nous, Spring DATA nous fourni l'implimentation de ces methodes.
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
