package com.neoris.prices.controller;

import com.neoris.prices.dto.ResponsePricesDto;
import com.neoris.prices.service.PricesService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prices")
public class PricesController {
    @Autowired
    PricesService pricesService;


    @GetMapping
    public ResponseEntity<Object> getPrices(@RequestParam Long brandId,
                                            @RequestParam Long productId,
                                            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate){
        try{
            ResponsePricesDto getPricesDto = pricesService.getPrices(brandId,productId,applicationDate);
            return ResponseEntity.ok(getPricesDto);
        }catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

}
