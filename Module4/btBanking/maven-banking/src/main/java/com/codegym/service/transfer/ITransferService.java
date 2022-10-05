package com.codegym.service.transfer;

import com.codegym.model.dto.ITransferDTO;
import com.codegym.model.dto.SumFeesAmountDTO;
import com.codegym.model.dto.TransferDTO;
import com.codegym.model.Transfer;
import com.codegym.service.IGeneralService;

import java.util.List;
import java.util.Optional;

public interface ITransferService extends IGeneralService<Transfer> {
    List<ITransferDTO> findAllByITransferDTO();

    Optional<TransferDTO> findByIdWithTransferDTO(Long id);

    Optional<SumFeesAmountDTO> sumFeesAmount();
}
