package tech.samagua.ekumen_tourism_tracker_auth_server.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    private Long id;
    private String username;
    private String email;
    private boolean enabled;
    private String role;
    private String profilePicture;

}