package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

//Design pattern pour l'acces aux donnees ( persistance et query operations )
//Interface qui contient les operations de bases ( ajout, modification , suppresion , recherche ...)
//Lors du #runtime# spring fourni une implemntation pour nous, Spring DATA nous fourni l'implimentation de ces methodes.
//  c est la calss #SimpleJpaRepository#
//  qui fait partie du starter #spring-boot-starter-data-jpa# qui sera disponible dans le classpath container Spring
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
