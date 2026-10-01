package pe.edu.utec.dbp.repository;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
    boolean exitsByEmail(String email);
    repository.findByID(id)
            .orElseThrow(()->
            new ConfigDataResourceNotFoundException("No existe"));
}
