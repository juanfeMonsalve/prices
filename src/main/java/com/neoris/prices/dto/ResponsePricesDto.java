package com.neoris.prices.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ResponsePricesDto {
    private Integer brandId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private int priceList;

    private int productId;

    private int priority;

    private BigDecimal price;

    private String curr;

}
