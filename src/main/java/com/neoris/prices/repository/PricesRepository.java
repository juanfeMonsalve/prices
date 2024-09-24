package com.neoris.prices.repository;

import com.neoris.prices.entity.Prices;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRepository extends CrudRepository<Prices,Integer> {
    List<Prices> findByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
            Long brandId, Long productId, LocalDateTime applicationDate, LocalDateTime applicationDate2);
}
