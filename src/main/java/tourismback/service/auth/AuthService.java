package tourismback.service.auth;

import tourismback.models.dto.auth.SignupRequest;
import tourismback.models.dto.auth.UsersDTO;

public interface AuthService {

    UsersDTO createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
