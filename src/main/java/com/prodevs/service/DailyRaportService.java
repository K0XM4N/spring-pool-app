package com.prodevs.service;

import com.prodevs.model.DailyRaport;
import com.prodevs.repository.DailyRaportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Krzysztof on 2017-05-17.
 */
@Service
public class DailyRaportService {

    @Autowired
    DailyRaportRepository dailyReportRepo;

    public DailyRaportService(DailyRaportRepository dailyReportRepo){
        this.dailyReportRepo = dailyReportRepo;
    }


    public DailyRaport findById(Integer dailyRaportId){

        return dailyReportRepo.findOne(dailyRaportId);

    }

}
