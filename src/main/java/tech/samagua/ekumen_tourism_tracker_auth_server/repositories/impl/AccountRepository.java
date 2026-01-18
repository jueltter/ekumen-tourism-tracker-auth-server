package tech.samagua.ekumen_tourism_tracker_auth_server.repositories.impl;

import ec.dev.samagua.commons_models.controllers_exceptions.RepositoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import tech.samagua.ekumen_tourism_tracker_auth_server.entities.Account;
import tech.samagua.ekumen_tourism_tracker_auth_server.repositories.AccountJpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AccountRepository {

    private final AccountJpaRepository accountJpaRepository;

    public List<Account> findAll() {
        try {
            return accountJpaRepository.findAll();

        }catch (Exception e){
            throw RepositoryException.getReadException(e);
        }
    }

    public Optional<Account> findByUsername(String username) {
        try {
            return accountJpaRepository.findByUsername(username);

        }catch (Exception e){
            throw RepositoryException.getReadException(e);
        }

    }

}
