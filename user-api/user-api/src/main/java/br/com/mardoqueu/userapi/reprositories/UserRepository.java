package br.com.mardoqueu.userapi.reprositories;

import br.com.mardoqueu.userapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
