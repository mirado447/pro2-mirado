package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.Endroit;

@AllArgsConstructor
@Getter
@Setter
public class Apartement {
    private int id;
    private String titre;
    private String description;
    private Double loyer;
    private Status status;
    private Endroit endroit;

    private enum Status {
        LIBRE,
        OCCUPE,
        LINERATION
    }
}
