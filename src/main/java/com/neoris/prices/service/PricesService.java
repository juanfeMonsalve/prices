package com.neoris.prices.service;

import com.neoris.prices.dto.ResponsePricesDto;
import com.neoris.prices.exception.PricesException;
import java.time.LocalDateTime;

public interface PricesService {

    ResponsePricesDto getPrices(Long brandId, Long productId, LocalDateTime applicationDate) throws PricesException;
}
