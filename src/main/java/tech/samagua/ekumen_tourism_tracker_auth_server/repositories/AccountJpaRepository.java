package tech.samagua.ekumen_tourism_tracker_auth_server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tech.samagua.ekumen_tourism_tracker_auth_server.entities.Account;

import java.util.Optional;

public interface AccountJpaRepository extends JpaRepository<Account, Long>, JpaSpecificationExecutor<Account> {

    Optional<Account> findByUsername(String username);

}
