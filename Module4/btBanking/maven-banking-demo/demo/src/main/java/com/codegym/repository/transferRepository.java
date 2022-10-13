package com.codegym.repository;

import com.codegym.model.Transfer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface transferRepository {
    @Modifying
    @Query("SELECT " +
            "t.id AS id, " +
            "t.sender.id AS senderId, " +
            "t.sender.fullName AS senderName, " +
            "t.recipient.id AS recipientId, " +
            "t.recipient.fullName AS recipientName, " +
            "t.transferAmount AS transferAmount, " +
            "t.fees AS fees, " +
            "t.feesAmount AS feesAmount " +
            "FROM Transfer t " )
    List<Transfer>findAllByITransfer();
}
