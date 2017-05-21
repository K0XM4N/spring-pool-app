package com.prodevs.service;

import com.prodevs.model.DailyRaport;
import com.prodevs.repository.DailyRaportRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Krzysztof on 2017-05-17.
 */
@Service
public class DailyRaportService {

    @Autowired
    private DailyRaportRepository dailyReportRepo;

    public DailyRaportService(DailyRaportRepository dailyReportRepo){
        this.dailyReportRepo = dailyReportRepo;
    }



    public DailyRaport findById(Integer dailyRaportId){

        return dailyReportRepo.findOne(dailyRaportId);

    }

    public List<DailyRaport> findAll(){

        return dailyReportRepo.findAll();

    }

    public DailyRaport save(DailyRaport savedRaport){

        return dailyReportRepo.saveAndFlush(savedRaport);

    }

    public DailyRaport update(DailyRaport modifiedRaport, Integer oldRaportId){

        DailyRaport updatedRaport = dailyReportRepo.findOne(oldRaportId);
        BeanUtils.copyProperties(modifiedRaport,updatedRaport);

        return dailyReportRepo.saveAndFlush(updatedRaport);

    }

    public void delete(DailyRaport deletedRaport){
        dailyReportRepo.delete(deletedRaport);
    }

}
