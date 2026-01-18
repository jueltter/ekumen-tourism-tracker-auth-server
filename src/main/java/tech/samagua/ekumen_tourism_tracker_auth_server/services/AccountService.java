package tech.samagua.ekumen_tourism_tracker_auth_server.services;

import org.springframework.stereotype.Service;
import tech.samagua.ekumen_tourism_tracker_auth_server.entities.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> findAll();
    Optional<Account> findByUsername(String username);
}
