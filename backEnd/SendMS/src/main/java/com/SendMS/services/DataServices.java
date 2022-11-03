/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SendMS.services;

import com.SendMS.RepositoriesEntry.EntriesRepository;
import com.SendMS.entities.Entry;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jhonn
 */
@Service
public class DataServices {
    
    @Autowired
    private EntriesRepository repository;
    
    public Page<Entry> findDatas(String initialDate, String finalDate, Pageable pageable){
        
      LocalDate hoje =  LocalDate.now();
      
      /*
        if (initialDate == null){
        initialDate = "2021-10-28";
        } 
           if (finalDate == null){
        initialDate = 
                String.valueOf(LocalDate.now()) ;
        }
        
        */
      
     
        LocalDate initial =  initialDate.equals("")? hoje.minusDays(150) : LocalDate.parse(initialDate);
        LocalDate finalDT = finalDate.equals("")? hoje: LocalDate.parse(finalDate);
        
    
     return repository.findSales(initial, finalDT, pageable);
    }
    
}
