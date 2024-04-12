package com.example.lab02_20201497.dataClasses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DatosJuego {
    private Integer filas;
    private Integer columnas;
    private Integer intentos;
    private Integer bombas;
    private String posiciones;
}
