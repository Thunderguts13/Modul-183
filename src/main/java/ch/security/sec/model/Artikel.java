package ch.security.sec.model;

import org.hibernate.annotations.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Artikel {

    @Id
    private Long id;

    @NotEmpty
    @NotNull
    private String bezeichnung;


    @NotEmpty
    @NotNull
    private int bestand;


    @NotEmpty
    @NotNull
    private float preis;


    public Artikel(Long id, String bezeichnung, int bestand, float preis) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.bestand = bestand;
        this.preis = preis;
    }

    public Artikel() {
    }

    public Long getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getBestand() {
        return bestand;
    }

    public float getPreis() {
        return preis;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }
}
