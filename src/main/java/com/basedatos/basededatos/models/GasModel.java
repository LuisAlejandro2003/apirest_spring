package com.basedatos.basededatos.models;

import jakarta.persistence.*;
@Entity
@Table(schema = "gas")
public class GasModel {
    @Id
    @Column(name = "id",updatable = false , nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "GasName")
    private String GasName;

    @Column(name = "ubication")
    private String ubication;

    @Column(name = "active")
    private Boolean active;
    @Column(name = "total")
   private int total;

    @Column(name = "telefono")
    private String telefono;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGasName() {
        return GasName;
    }

    public void setGasName(String gasName) {
        GasName = gasName;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
