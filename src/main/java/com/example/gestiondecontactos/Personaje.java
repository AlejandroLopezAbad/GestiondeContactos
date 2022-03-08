package com.example.gestiondecontactos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Personaje {
    private String image;
    private String nombre;
    private String raza;
    private String genero;
    private String ki;
}
