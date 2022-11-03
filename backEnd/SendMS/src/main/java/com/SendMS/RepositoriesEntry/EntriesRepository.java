/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SendMS.RepositoriesEntry;

import com.SendMS.entities.Entry;
import java.time.LocalDate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EntriesRepository extends JpaRepository<Entry, Long>{
    
    @Query("SELECT obj FROM Entry obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
   Page<Entry> findSales(LocalDate min, LocalDate max, Pageable pageable);
    
}
