package com.itgstore.productservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Product implements Serializable {

	@Id
    @GeneratedValue
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="fabriquant")
    private String fabriquant;

    @Column(name="date_fabrication")
    private LocalDateTime dateFabrication;

    @Column(name="date_expiration")
    private LocalDateTime dateExpiration;

    @Column(name="heure")
    private Date heure;

    @Column(name="poids")
    private Integer poids;

    public Product(){

    }

    public Product(String name){
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFabriquant(){
        return fabriquant;
    }

    public void setFabriquant(String fabriquant){
        this.fabriquant = fabriquant;
    }

    public LocalDateTime getDateFabrication(){
        return dateFabrication;
    }

    public void setDateFabrication(LocalDateTime dateFabrication){
        this.dateFabrication = dateFabrication;
    }

    public LocalDateTime getDateExpiration(){
        return dateExpiration;
    }

    public void setDateExpiration(LocalDateTime dateExpiration){
        this.dateExpiration = dateExpiration;
    }

    public Integer getPoids(){
        return poids;
    }

    public void setPoids(Integer poids){
        this.poids = poids;
    }

    public Date getHeure(){
        return heure;
    }

    public void setHeure(Date heure){
        this.heure = heure;
    }    


}