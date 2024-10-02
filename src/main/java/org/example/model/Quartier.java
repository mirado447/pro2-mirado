package org.example.model;

import org.example.Endroit;

import java.util.List;

public class Quartier extends Endroit {
    private List<Immeuble> immeubles;
    private List<Apartement> apartements;

    public Quartier(int id, String nom) {
        super(id, nom);
    }

    public boolean appartementPresent(Apartement apartement){
        Boolean response = false;
        if(apartement.getEndroit() instanceof Quartier){
               response = apartement.getEndroit().getNom() == this.nom;
        }if (apartement.getEndroit() instanceof Immeuble){
            for (Immeuble immeuble : immeubles){
                response = apartement.getEndroit().getNom() == immeuble.getNom();
            }
        }
        return response;
    }

    @Override
    public int nombreApartement() {
        return apartements.size();
    }
}
