package com.springproject.springproject.Rate;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Rate {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer rateId;
    @Column(name = "classemployee_id")
    private Integer classemployeeId;
    @Basic
    @Column(name = "data_dodania")
    private LocalDate dataDodania;
    @Basic
    @Column(name = "komentarz")
    private String komentarz;
    @Basic
    @Column(name = "ocena")
    private Integer ocena;

    public Rate(Integer rateId, Integer classemployeeId, String komentarz, Integer ocena) {
        this.rateId = rateId;
        this.classemployeeId = classemployeeId;
        this.dataDodania = LocalDate.now();
        this.komentarz = komentarz;
        this.ocena = ocena;
    }
    public Rate(){

    }

    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public Integer getOcena() {
        return ocena;
    }

    public void setOcena(Integer ocena) {
        this.ocena = ocena;
    }

    public LocalDate getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(LocalDate dataDodania) {
        this.dataDodania = dataDodania;
    }

    public String getKomentarz() {
        return komentarz;
    }

    public void setKomentarz(String komentarz) {
        this.komentarz = komentarz;
    }

    public Integer getClassemployeeId() {
        return classemployeeId;
    }

    public void setClassemployeeId(Integer classemployeeId) {
        this.classemployeeId = classemployeeId;
    }


}
