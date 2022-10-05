package com.codegym.service.transfer;

import com.codegym.model.dto.ITransferDTO;
import com.codegym.model.dto.SumFeesAmountDTO;
import com.codegym.model.dto.TransferDTO;
import com.codegym.model.Transfer;
import com.codegym.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TransferServiceImpl implements ITransferService {

    @Autowired
    private TransferRepository transferRepository;

    @Override
    public Iterable<Transfer> findAll() {
        return null;
    }

    @Override
    public Optional<Transfer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<TransferDTO> findByIdWithTransferDTO(Long id) {
        return transferRepository.findByIdWithTransferDTO(id);
    }

    @Override
    public List<ITransferDTO> findAllByITransferDTO() {
        return transferRepository.findAllByITransferDTO();
    }

    @Override
    public Optional<SumFeesAmountDTO> sumFeesAmount() {
        return transferRepository.sumFeesAmount();
    }

    @Override
    public Transfer save(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    @Override
    public void remove(Long id) {

    }
}
