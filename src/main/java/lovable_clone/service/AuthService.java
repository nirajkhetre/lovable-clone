package lovable_clone.service;

import lovable_clone.dto.auth.AuthResponse;
import lovable_clone.dto.auth.LoginRequest;
import lovable_clone.dto.auth.SignUpRequest;
import lovable_clone.dto.auth.UserProfileResponse;

public interface AuthService {
    AuthResponse sighnUp(SignUpRequest request);

    AuthResponse login(LoginRequest request);
}
