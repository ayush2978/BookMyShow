package com.ayush.bookmyshow.models;

import com.ayush.bookmyshow.models.enums.Features;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String number;
    private int maxRows;
    private int maxCols;

    @ManyToOne
    private Theatre theatre;

    @OneToMany(mappedBy = "audi")
    private List<Seat> seats;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Features> supportedFeatures;
}
