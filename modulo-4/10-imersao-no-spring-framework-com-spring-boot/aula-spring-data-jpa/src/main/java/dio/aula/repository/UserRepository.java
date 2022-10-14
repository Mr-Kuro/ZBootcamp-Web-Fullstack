package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

//    Query Method
    List<User> findByNamaContaining(String name);

//    Query Method
    User findUserByName(String nome);

//    Query Override
//    @Query("SELECT * FROM api_spring.tab_user where nome like %:name%")
    @Query("SELECT u FROM User U EHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);
}
