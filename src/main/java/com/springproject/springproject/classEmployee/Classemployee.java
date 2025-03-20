package com.springproject.springproject.classEmployee;

import jakarta.persistence.*;

@Entity
@Table(name = "classemployee")
public class Classemployee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer classemployeeId;
    @Basic
    @Column(name = "max_liczba_pracownikow")
    private Integer maxLiczbaPracownikow;
    @Basic
    @Column(name = "nazwa_grupy")
    private String nazwaGrupy;

    public Classemployee(Integer classemployeeId, Integer maxLiczbaPracownikow, String nazwaGrupy) {
        this.classemployeeId = classemployeeId;
        this.maxLiczbaPracownikow = maxLiczbaPracownikow;
        this.nazwaGrupy = nazwaGrupy;
    }

    public Classemployee() {
    }

    public int getClassemployeeId() {
        return classemployeeId;
    }

    public void setClassemployeeId(int classemployeeId) {
        this.classemployeeId = classemployeeId;
    }

    public String getNazwaGrupy() {
        return nazwaGrupy;
    }

    public void setNazwaGrupy(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;
    }

    public Integer getMaxLiczbaPracownikow() {
        return maxLiczbaPracownikow;
    }

    public void setMaxLiczbaPracownikow(Integer maxLiczbaPracownikow) {
        this.maxLiczbaPracownikow = maxLiczbaPracownikow;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classemployee that = (Classemployee) o;

        if (classemployeeId != that.classemployeeId) return false;
        if (nazwaGrupy != null ? !nazwaGrupy.equals(that.nazwaGrupy) : that.nazwaGrupy != null) return false;
        if (maxLiczbaPracownikow != null ? !maxLiczbaPracownikow.equals(that.maxLiczbaPracownikow) : that.maxLiczbaPracownikow != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classemployeeId;
        result = 31 * result + (nazwaGrupy != null ? nazwaGrupy.hashCode() : 0);
        result = 31 * result + (maxLiczbaPracownikow != null ? maxLiczbaPracownikow.hashCode() : 0);
        return result;
    }
}
