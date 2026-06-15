package app.model.dto.user;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserRegisterRequest {

    private String username;
    private String email;
    private String password;
    private UserRole userRole;
}
