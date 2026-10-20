package com.ommooley.project.vibeflow.services;

import com.ommooley.project.vibeflow.dto.member.InviteMemberRequest;
import com.ommooley.project.vibeflow.dto.member.MemberResponse;
import com.ommooley.project.vibeflow.entities.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
