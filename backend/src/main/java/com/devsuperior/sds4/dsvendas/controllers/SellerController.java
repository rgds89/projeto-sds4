package com.devsuperior.sds4.dsvendas.controllers;

import com.devsuperior.sds4.dsvendas.dto.SellerDTO;
import com.devsuperior.sds4.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> list = sellerService.findAll();
        return ResponseEntity.ok(list);
    }
}
