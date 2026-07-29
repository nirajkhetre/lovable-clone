package lovable_clone.dto.member;

import lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole projectRole
) {
}
