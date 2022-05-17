package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import com.example.demo.model.Formateador;

@Entity
@Table(name = "phonebook")

public class Name implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nombre", nullable=false, length=200)
    private String name;
    @Column(name = "Numero", nullable=false, length=20)
    private String phone_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        String yy = Formateador.formateador(phone_number);
        this.phone_number = yy;
    }

}
