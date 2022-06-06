package com.tecazuay.complexivog2c2.dto.carreras;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarrerasResponse implements Serializable {

    private String nombre;
    private String codigo;



}
