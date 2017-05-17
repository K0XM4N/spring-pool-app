package com.prodevs.repository;

import com.prodevs.model.DailyRaport;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Krzysztof on 2017-05-17.
 */
public interface DailyRaportRepository extends JpaRepository<DailyRaport, Integer> {
}
