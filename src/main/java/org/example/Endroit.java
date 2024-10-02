package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
abstract public class Endroit {
    protected int id;
    protected String nom;

    abstract public int nombreApartement();
}
