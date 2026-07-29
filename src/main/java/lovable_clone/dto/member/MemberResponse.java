package lovable_clone.dto.member;

import lovable_clone.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avtarUrl,
        ProjectRole projectRole,
        Instant updatedAt
) {
}
