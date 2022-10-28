/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SendMS.SendMS.RepositoriesEntry;

import com.SendMS.SendMS.entities.Entry;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EntriesRepository extends JpaRepository<Entry, Long>{
    
    
    
}
