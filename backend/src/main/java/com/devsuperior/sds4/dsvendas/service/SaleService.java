package com.devsuperior.sds4.dsvendas.service;

import com.devsuperior.sds4.dsvendas.dto.SaleDTO;
import com.devsuperior.sds4.dsvendas.entities.Sale;
import com.devsuperior.sds4.dsvendas.repositories.SaleRepository;
import com.devsuperior.sds4.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }
}
