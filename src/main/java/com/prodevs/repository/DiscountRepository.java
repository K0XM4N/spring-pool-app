package com.prodevs.repository;

import com.prodevs.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Krzysztof on 2017-05-17.
 */
public interface DiscountRepository extends JpaRepository<Discount, Integer> {
}
