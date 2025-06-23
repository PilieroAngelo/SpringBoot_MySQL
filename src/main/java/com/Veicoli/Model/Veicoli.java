package com.Veicoli.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "veicoli")
public class Veicoli {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;
@Column(nullable = false)
    private String modello;

   @Column(nullable = false)
    private String tipoAlimentazione;
@Column(nullable = false)
    private int annoCreazione;

    @Column(nullable = false)
    private double prezzo;

    public Veicoli() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTipoAlimentazione() {
        return tipoAlimentazione;
    }

    public void setTipoAlimentazione(String tipoAlimentazione) {
        this.tipoAlimentazione = tipoAlimentazione;
    }

    public int getAnnoCreazione() {
        return annoCreazione;
    }

    public void setAnnoCreazione(int annoCreazione) {
        this.annoCreazione = annoCreazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
