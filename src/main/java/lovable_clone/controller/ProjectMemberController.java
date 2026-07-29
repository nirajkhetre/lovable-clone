package lovable_clone.controller;

import lombok.RequiredArgsConstructor;
import lovable_clone.dto.member.InviteMemberRequest;
import lovable_clone.dto.member.MemberResponse;
import lovable_clone.dto.member.UpdateMemberRoleRequest;
import lovable_clone.entity.ProjectMember;
import lovable_clone.service.ProjectMemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/members")
public class ProjectMemberController {

    private ProjectMemberService projectMemberService;

    @GetMapping
    public ResponseEntity<List<ProjectMember>> getMembers(@PathVariable long projectId){
        Long userId = 1L;
        return ResponseEntity.ok(projectMemberService.getProjectMember(projectId,userId));
    }

    @PostMapping
    public ResponseEntity<MemberResponse> addMember(
            @PathVariable Long projectId,
            @RequestBody InviteMemberRequest request
    ){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(
                projectMemberService.inviteMember(userId,projectId,request)
        );
    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMember(
            @PathVariable Long projectId,
            @RequestBody UpdateMemberRoleRequest request,
            @PathVariable String memberId
    ){
        Long userId = 1L;
        return ResponseEntity.ok(
                projectMemberService.updateMemberRole(projectId,memberId,userId,request)
        );
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteMember(
            @PathVariable Long projectId,
            @PathVariable String memberId
    ){
        Long userId = 1L;
        return ResponseEntity.ok(
                projectMemberService.deleteProjectMember(projectId,userId,memberId)
        );
    }
}
