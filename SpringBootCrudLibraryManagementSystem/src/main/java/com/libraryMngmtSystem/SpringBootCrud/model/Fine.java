package com.libraryMngmtSystem.SpringBootCrud.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fineId;

    @ManyToOne
    @JoinColumn(name = "borrowId", referencedColumnName = "borrowId")
    private BorrowingRecord borrowingRecord;

    @Column(nullable = false)
    private BigDecimal fineAmount;

    @Column(nullable = false)
    private Boolean paid = false;

    public Fine() {
    }

    public Fine(Integer fineId, BorrowingRecord borrowingRecord, BigDecimal fineAmount, Boolean paid) {
        this.fineId = fineId;
        this.borrowingRecord = borrowingRecord;
        this.fineAmount = fineAmount;
        this.paid = paid;
    }

    public Integer getFineId() {
        return fineId;
    }

    public void setFineId(Integer fineId) {
        this.fineId = fineId;
    }

    public BorrowingRecord getBorrowingRecord() {
        return borrowingRecord;
    }

    public void setBorrowingRecord(BorrowingRecord borrowingRecord) {
        this.borrowingRecord = borrowingRecord;
    }

    public BigDecimal getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(BigDecimal fineAmount) {
        this.fineAmount = fineAmount;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
}
