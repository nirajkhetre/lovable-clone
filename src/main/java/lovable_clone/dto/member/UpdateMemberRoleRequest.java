package lovable_clone.dto.member;

import lovable_clone.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        ProjectRole projectRole
) {
}
