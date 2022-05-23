package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import com.example.demo.controller.Formateador;

@Entity
@Table(name = "agenda")

public class Agenda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nombre", nullable=false, length=200)
    private String nombre;
    @Column(name = "Numero", nullable=false, length=20)
    private String numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String numeroFormateado = Formateador.formateador(numero);
        this.numero = numeroFormateado;
    }

}
