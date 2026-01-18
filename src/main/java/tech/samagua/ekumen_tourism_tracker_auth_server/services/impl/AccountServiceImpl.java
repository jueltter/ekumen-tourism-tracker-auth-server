package tech.samagua.ekumen_tourism_tracker_auth_server.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.samagua.ekumen_tourism_tracker_auth_server.entities.Account;
import tech.samagua.ekumen_tourism_tracker_auth_server.repositories.impl.AccountRepository;
import tech.samagua.ekumen_tourism_tracker_auth_server.services.AccountService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;


    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }
}
