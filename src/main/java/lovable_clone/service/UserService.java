package lovable_clone.service;

import lovable_clone.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getUserProfile(Long id);
}
