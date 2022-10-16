package one.digitalinovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepsitory extends CrudRepository<Cliente, Long> {
}
