package com.codegym.service.customer;

import com.codegym.model.dto.*;
import com.codegym.model.Customer;
import com.codegym.service.IGeneralService;

import java.math.BigDecimal;
import java.util.Optional;

public interface ICustomerService extends IGeneralService<Customer> {

    Customer findByIdObj(Long id);

    Boolean existsByEmail(String email);

    Iterable<Customer> findAllByDeletedIsFalse();

    Optional<DepositDTO> findByIdWithDepositDTO(Long id);

    Optional<WithdrawDTO> findByIdWithWithdrawDTO(Long id);

    Iterable<RecipientDTO> findAllRecipientDTOByIdWithOutSender(Long id);

    Iterable<RecipientDTO> findAllRecipientDTOByIdWithOutSenderAndDeletedIsFalse(Long id);

    void doDeposit(Long customerId, DepositDTO depositDTO);

    void doWithdraw(Long customerId, WithdrawDTO withdrawDTO);

    void doTransfer(TransferDTO transferDTO, Optional<Customer> sender, Optional<Customer> recipient) ;

    void incrementBalance(BigDecimal balance, Long id);

    void reduceBalance(BigDecimal balance, Long id);

}
