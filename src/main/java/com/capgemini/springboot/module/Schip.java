package com.capgemini.springboot.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Schip {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    long id;

    public String type;
    public int lengte;
    public int aantalPassagiers;
    public LocalDateTime bouwdatum;
    public String naam;
    public int topSnelheid;

}
