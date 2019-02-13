package com.capgemini.springboot.api;


import com.capgemini.springboot.controller.SchipRepository;
import com.capgemini.springboot.controller.SchipService;
import com.capgemini.springboot.module.Schip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SchipEndPoint {
    @Autowired
    private SchipRepository mijnSchipRepository;
        //mijnSchipRepository is de identifier

    @GetMapping("/schip/{nieuwschip}")
    public Schip nieuwSchip(@PathVariable String nieuwschip){
  // was eerst String, maar veranderd naar de Schip (entity) om alles terug te sturen
        System.out.println("nieuwschip");
        Schip hetSchip = new Schip();
        hetSchip.naam = nieuwschip;
        Schip vliegendeHollander = mijnSchipRepository.save(hetSchip);
       // Schip vliegendeHollander = mijnSchipRepository.save(new Schip());
        return vliegendeHollander;
    }

    @GetMapping("/schepen")
    public Iterable<Schip> geefAlleSchepen(){
        Iterable<Schip> scheepHaven = mijnSchipRepository.findAll();
        return scheepHaven;
    }

}
