package com.ayush.bookmyshow.models;

import com.ayush.bookmyshow.models.enums.SeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatInShow extends BaseModel{

//    @OneToOne
//    private Seat seat;
//    @OneToOne
//    private Show show;
    @Enumerated(EnumType.ORDINAL)
    private SeatStatus seatStatus;
}
