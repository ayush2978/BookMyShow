package com.ayush.bookmyshow.models;

import com.ayush.bookmyshow.models.enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String seatNumber;

    @ManyToOne
    private Auditorium audi;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    private int rowNumber;
    private int colNumber;
}
