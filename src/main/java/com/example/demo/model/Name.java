package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "phonebook")

public class Name implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nombre", nullable=false)
    private String name;
    @Column(name = "Numero", nullable=false, length=10)
    private String phone_number;
    @Column(name = "CodigoArea", nullable=false, length=4)
    private String cod_area;

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

        String name_minus = phone_number.toLowerCase();
        char[] arrayConverted = new char[name_minus.length()];

            for (int i = 0; i < name_minus.length(); i++) {
                arrayConverted[i] = name_minus.charAt(i);

                if (arrayConverted[i] == 'a' || arrayConverted[i] == 'b' || arrayConverted[i] == 'c') {
                    arrayConverted[i] = '2';
                } else if (arrayConverted[i] == 'd' || arrayConverted[i] == 'e' || arrayConverted[i] == 'f') {
                    arrayConverted[i] = '3';
                } else if (arrayConverted[i] == 'g' || arrayConverted[i] == 'h' || arrayConverted[i] == 'i') {
                    arrayConverted[i] = '4';
                } else if (arrayConverted[i] == 'j' || arrayConverted[i] == 'k' || arrayConverted[i] == 'l') {
                    arrayConverted[i] = '5';
                } else if (arrayConverted[i] == 'm' || arrayConverted[i] == 'n' || arrayConverted[i] == 'o') {
                    arrayConverted[i] = '6';
                } else if (arrayConverted[i] == 'p' || arrayConverted[i] == 'q' || arrayConverted[i] == 'r' || arrayConverted[i] == 's') {
                    arrayConverted[i] = '7';
                } else if (arrayConverted[i] == 't' || arrayConverted[i] == 'u' || arrayConverted[i] == 'v') {
                    arrayConverted[i] = '8';
                } else if (arrayConverted[i] == 'w' || arrayConverted[i] == 'x' || arrayConverted[i] == 'y' || arrayConverted[i] == 'z') {
                    arrayConverted[i] = '9';
                } else {
                    arrayConverted[i] = name_minus.charAt(i);
                }
            }

        String result = String.valueOf(arrayConverted);

            if (result.length() == 8) {
                String resultA = result.substring(0, 4);
                String resultB = result.substring(4, 8);
                result = resultA + "-" + resultB;
            }
        this.phone_number = result;
    }

    public String getCod_area() {
        return cod_area;
    }

    public void setCod_area(String cod_area) {
        this.cod_area = cod_area;
    }
}
