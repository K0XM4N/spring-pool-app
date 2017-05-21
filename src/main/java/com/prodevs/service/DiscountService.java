package com.prodevs.service;

import com.prodevs.model.Discount;
import com.prodevs.repository.DiscountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Krzysztof on 2017-05-21.
 */
@Service
public class DiscountService {

    @Autowired
    private DiscountRepository discountRepo;

    public DiscountService(DiscountRepository repository ){
        this.discountRepo = repository;
    }


    public Discount findById(Integer discountId){

        return discountRepo.findOne(discountId);

    }

    public List<Discount> findAll(){

        return discountRepo.findAll();

    }

    public Discount save(Discount savedDiscount){

        return discountRepo.saveAndFlush(savedDiscount);

    }

    public Discount update(Discount modifiedDiscount, Integer oldDiscountId){

        Discount updatedDiscount = discountRepo.findOne(oldDiscountId);
        BeanUtils.copyProperties(modifiedDiscount,updatedDiscount);

        return discountRepo.saveAndFlush(updatedDiscount);

    }

    public void delete(Discount deletedDiscount){

        discountRepo.delete(deletedDiscount);

    }

}
