/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SendMS.SendMS.services;

import com.SendMS.SendMS.RepositoriesEntry.EntriesRepository;
import com.SendMS.SendMS.entities.Entry;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jhonn
 */
@Service
public class DataServices {
    
    @Autowired
    private EntriesRepository repository;
    
    public List<Entry> findDatas(){
        
     return repository.findAll();
    }
    
}
