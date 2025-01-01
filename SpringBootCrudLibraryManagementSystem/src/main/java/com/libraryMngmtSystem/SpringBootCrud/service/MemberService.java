package com.libraryMngmtSystem.SpringBootCrud.service;

import com.libraryMngmtSystem.SpringBootCrud.model.Member;
import java.util.List;

public interface MemberService {

    // Add a new member
    Member addMember(Member member);

    // Get a member by ID
    Member getMemberById(Long id);

    // Get all members
    List<Member> getAllMembers();

    // Update a member
    Member updateMember(Long id, Member member);

    // Delete a member by ID
    void deleteMember(Long id);
}
