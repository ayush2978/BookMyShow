package com.ayush.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private String amount;

    @OneToMany
    private List<SeatInShow> seatInShow;

    private Date bookingTime;

    @OneToOne
    private Payment payment;

    @OneToOne
    private User user;
}
