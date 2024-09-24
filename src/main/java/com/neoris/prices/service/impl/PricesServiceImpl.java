package com.neoris.prices.service.impl;

import com.neoris.prices.dto.ResponsePricesDto;
import com.neoris.prices.entity.Prices;
import com.neoris.prices.exception.PricesException;
import com.neoris.prices.mapper.PricesMapper;
import com.neoris.prices.repository.PricesRepository;
import com.neoris.prices.service.PricesService;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PricesServiceImpl implements PricesService {
    @Autowired
    PricesRepository pricesRepository;
    @Autowired
    PricesMapper pricesMapper;


    @Override
    public ResponsePricesDto getPrices(Long brandId, Long productId, LocalDateTime applicationDate) throws PricesException {
        List<Prices> prices = pricesRepository.
                findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual
                        (brandId,productId,applicationDate,applicationDate);

        return pricesMapper.pricesToDto(prices.stream()
                .max(Comparator.comparing(Prices::getPriority))
                .orElseThrow(() -> new PricesException("No se encontro ningun registro")));
    }

}
