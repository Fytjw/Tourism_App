package tourismback.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.auth.Users;
import tourismback.enums.UserRole;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findFirstByEmail(String email);

    Users findByUserRole(UserRole userRole);

    Users findByEmailAndPassword(String email, String password);
}
