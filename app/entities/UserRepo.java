package app.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserAccount, Long> {
      UserAccount  findByUsername(String username);
}
