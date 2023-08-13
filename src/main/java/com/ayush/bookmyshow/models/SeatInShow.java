package com.ayush.bookmyshow.models;

import com.ayush.bookmyshow.models.enums.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatInShow extends BaseModel{

//    private Seat seat;
//    private Show show;
    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;
}
