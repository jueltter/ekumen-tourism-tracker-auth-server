package tech.samagua.ekumen_tourism_tracker_auth_server.controllers;

import ec.dev.samagua.commons_models.controllers_models.ControllerResult;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.samagua.ekumen_tourism_tracker_auth_server.dtos.AccountDto;
import tech.samagua.ekumen_tourism_tracker_auth_server.services.AccountService;
import tech.samagua.ekumen_tourism_tracker_auth_server.utils.mappers.AccountMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;
    private final AccountMapper accountMapper;

    @GetMapping
    @CrossOrigin("*")
    public ResponseEntity<ControllerResult<List<AccountDto>>> findAll(){
        var items = accountService.findAll();
        var dtos = items.stream().map(accountMapper::entityToDto).toList();
        return ResponseEntity.ok(ControllerResult.getSuccessResult(dtos));
    }

    @GetMapping("/{username}")
    @CrossOrigin("*")
    public ResponseEntity<ControllerResult<AccountDto>> findByUsername(@PathVariable String username){
        var itemOpt = accountService.findByUsername(username);
        if (itemOpt.isPresent()){
            var dto = accountMapper.entityToDto(itemOpt.get());
            return ResponseEntity.ok(ControllerResult.getSuccessResult(dto));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
