package com.devsuperior.sds4.dsvendas.controllers;

import com.devsuperior.sds4.dsvendas.dto.SaleDTO;
import com.devsuperior.sds4.dsvendas.dto.SellerDTO;
import com.devsuperior.sds4.dsvendas.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = saleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}