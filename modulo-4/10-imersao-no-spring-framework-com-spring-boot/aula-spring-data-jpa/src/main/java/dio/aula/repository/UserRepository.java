package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories("dio.aula.repository")
public interface UserRepository extends JpaRepository<User, Integer> {

//    Query Method
    List<User> findByNameContaining(String name);

//    Query Method
//    User findUserByName(String name);

//    Query Override
//    @Query("SELECT * FROM api_spring.tab_user WHERE name LIKE %:name%")
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
}
