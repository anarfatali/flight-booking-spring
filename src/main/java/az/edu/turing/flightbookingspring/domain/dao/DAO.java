package az.edu.turing.flightbookingspring.domain.dao;

import java.util.Collection;
import java.util.Optional;

public interface DAO<E, I> {

    Collection<E> findAll();

    E create(E entity);

    Optional<E> getById(I id);

}
