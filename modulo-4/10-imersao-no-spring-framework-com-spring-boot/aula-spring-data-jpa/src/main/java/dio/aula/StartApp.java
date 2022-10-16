package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Autowired
    private User user;

    @Override
    public void run(String... args) throws Exception {

        insertUser();
        List<User> users = repository.findByNameContaining("Anderson");
        System.out.println(repository.findAll());
        for (User u: users) {
            System.out.println("\n\n"+u.getName()+ " = " + u +"\n\n");
        }
    }

    public void insertUser(){
        user.setName("Anderson");
        user.setUsername("Kuro");
        user.setPassword("dio123");

        repository.save(user);

        System.out.println("\n\n");
        for (User u: repository.findAll()){
            System.out.println(u.toString()+"\n");
        }
        System.out.println("\n\n");
    }
}
