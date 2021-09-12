package com.devsuperior.sds4.dsvendas.dto;

import com.devsuperior.sds4.dsvendas.entities.Sale;
import com.devsuperior.sds4.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO  implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long visited;
    private Long deals;
    private Double amount;
    private LocalDate date;
    private SellerDTO seller;

    public SaleDTO(Sale entity){
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDTO(entity.getSeller());
    }
}
