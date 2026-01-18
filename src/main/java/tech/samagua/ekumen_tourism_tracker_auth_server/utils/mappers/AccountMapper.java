package tech.samagua.ekumen_tourism_tracker_auth_server.utils.mappers;

import org.mapstruct.Mapper;
import tech.samagua.ekumen_tourism_tracker_auth_server.dtos.AccountDto;
import tech.samagua.ekumen_tourism_tracker_auth_server.entities.Account;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountDto entityToDto(Account achievement);

    Account dtoToEntity(AccountDto achievementDto);


}
