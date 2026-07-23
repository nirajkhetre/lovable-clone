package lovable_clone.dto.auth;

public record SignUpRequest(
        String name,
        String email,
        String Password
) {
}
