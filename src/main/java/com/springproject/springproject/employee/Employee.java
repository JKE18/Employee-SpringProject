package com.springproject.springproject.employee;


import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, name = "imie")
    private String imie;

    @Column(nullable = false,name = "nazwisko")
    private String nazwisko;
    @Column(nullable = false,name = "stan_pracownika")
    private String stan;
    @Column(nullable = false,name = "rok_urodzenia")
    private Integer rok_uro;
    @Column(nullable = false,name = "wynagrodzenie")
    private Double wynagrodzenie;
    @Column(name = "classemployee_id")
    private int classemployeeId;

    public Employee() {
    }
    public Employee(Integer id, String imie, String nazwisko, String stan, Integer rok_uro, Double wynagrodzenie, Integer classemployeeId) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stan = stan;
        this.rok_uro = rok_uro;
        this.wynagrodzenie = wynagrodzenie;
        this.classemployeeId = classemployeeId;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStan() {
        return stan;
    }

    public void setStan(String stan) {
        this.stan = stan;
    }

    public int getRok_uro() {
        return rok_uro;
    }

    public void setRok_uro(int rok_uro) {
        this.rok_uro = rok_uro;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    public Integer getClassemployeeId() {
        return classemployeeId;
    }
    public void setClassemployeeId(Integer classemployeeId) {
        this.classemployeeId = classemployeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stan='" + stan + '\'' +
                ", rok_uro=" + rok_uro +
                ", wynagrodzenie=" + wynagrodzenie +
                '}';
    }
}
