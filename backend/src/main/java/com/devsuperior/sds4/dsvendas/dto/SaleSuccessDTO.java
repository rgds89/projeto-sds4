package com.devsuperior.sds4.dsvendas.dto;

import com.devsuperior.sds4.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(Seller seller, Long visited, long deals){
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
