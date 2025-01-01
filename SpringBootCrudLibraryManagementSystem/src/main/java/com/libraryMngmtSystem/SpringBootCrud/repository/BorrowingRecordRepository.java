package com.libraryMngmtSystem.SpringBootCrud.repository;


import com.libraryMngmtSystem.SpringBootCrud.model.BorrowingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecord, Long> {
    // Find all borrowing records for a specific member
    List<BorrowingRecord> findByMemberMemberId(Long memberId);

    // Find overdue borrowing records
    @Query("SELECT br FROM BorrowingRecord br WHERE br.returnDate IS NULL AND br.dueDate < CURRENT_DATE")
    List<BorrowingRecord> findOverdueBorrowingRecords();
}
