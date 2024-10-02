package org.example.model;

import org.example.Endroit;

import java.util.List;


public class Immeuble extends Endroit {
    private int etages;
    private List<Apartement> apartements;

    public Immeuble(int id, String nom) {
        super(id, nom);
    }

    @Override
    public int nombreApartement() {
        return apartements.size();
    }
}
