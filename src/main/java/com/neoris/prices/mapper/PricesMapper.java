package com.neoris.prices.mapper;

import com.neoris.prices.dto.ResponsePricesDto;
import com.neoris.prices.entity.Prices;

public interface PricesMapper {

    ResponsePricesDto pricesToDto(Prices prices);

}
