package com.neoris.prices.mapper.Impl;

import com.neoris.prices.dto.ResponsePricesDto;
import com.neoris.prices.entity.Prices;
import com.neoris.prices.mapper.PricesMapper;
import org.springframework.stereotype.Component;

@Component
public class PricesMapperImp implements PricesMapper {


    @Override
    public ResponsePricesDto pricesToDto(Prices prices) {
        ResponsePricesDto responsePricesDto = new ResponsePricesDto();
        responsePricesDto.setBrandId(prices.getBrandId());
        responsePricesDto.setPrice(prices.getPrice());
        responsePricesDto.setPriceList(prices.getPriceList());
        responsePricesDto.setCurr(prices.getCurr());
        responsePricesDto.setPriority(prices.getPriority());
        responsePricesDto.setEndDate(prices.getEndDate());
        responsePricesDto.setStartDate(prices.getStartDate());
        responsePricesDto.setProductId(prices.getProductId());
        return responsePricesDto;
    }
}
