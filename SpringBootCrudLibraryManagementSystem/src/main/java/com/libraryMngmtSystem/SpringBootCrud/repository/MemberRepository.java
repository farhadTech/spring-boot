package com.libraryMngmtSystem.SpringBootCrud.repository;


import com.libraryMngmtSystem.SpringBootCrud.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // Find member by email
    Member findByEmail(String email);

    // Find members by full name
    List<Member> findByFullName(String fullName);
}
