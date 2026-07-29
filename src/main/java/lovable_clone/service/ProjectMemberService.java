package lovable_clone.service;

import lovable_clone.dto.member.InviteMemberRequest;
import lovable_clone.dto.member.MemberResponse;
import lovable_clone.dto.member.UpdateMemberRoleRequest;
import lovable_clone.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMember(long projectId, Long userId);

    MemberResponse inviteMember(Long userId, Long projectId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, String memberId, Long userId, UpdateMemberRoleRequest request);

    MemberResponse deleteProjectMember(Long projectId, Long userId, String memberId);
}
