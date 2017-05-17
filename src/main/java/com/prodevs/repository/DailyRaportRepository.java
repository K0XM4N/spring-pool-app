package com.prodevs.repository;

import com.prodevs.model.DailyRaport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Krzysztof on 2017-05-17.
 */
@Repository
public interface DailyRaportRepository extends JpaRepository<DailyRaport, Integer> {
}
