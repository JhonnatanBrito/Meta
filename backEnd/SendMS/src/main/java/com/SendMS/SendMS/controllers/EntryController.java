/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SendMS.SendMS.controllers;

import com.SendMS.SendMS.entities.Entry;
import com.SendMS.SendMS.services.DataServices;
import java.util.List;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController   // anotação que define o controller
@RequestMapping(value = "/sales")  // anotação que define o Endpoint do controller
public class EntryController {
    
    @Autowired
    DataServices service;
    
    @GetMapping
    public List<Entry> findData(){  // retorna a lista de dados do repository / services/ 
        return service.findDatas(); 
    }
}
