package lovable_clone.controller;

import lombok.RequiredArgsConstructor;
import lovable_clone.dto.auth.AuthResponse;
import lovable_clone.dto.auth.LoginRequest;
import lovable_clone.dto.auth.SignUpRequest;
import lovable_clone.dto.auth.UserProfileResponse;
import lovable_clone.service.AuthService;
import lovable_clone.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/auth")
public class AuthController {
    private AuthService authService;
    private UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<AuthResponse> signUp(SignUpRequest Request){
         return ResponseEntity.ok(authService.sighnUp(Request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request){
        return ResponseEntity.ok(authService.login(request));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getUserProfile(){
        Long id = 1L;
        return ResponseEntity.ok(userService.getUserProfile(id));
    }

}
