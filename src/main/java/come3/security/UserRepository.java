package come3.security;

import come3.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{


    Optional<User> findByEmail(String email);
}
