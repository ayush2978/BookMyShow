package com.ayush.bookmyshow.models;

import com.ayush.bookmyshow.models.enums.PaymentMode;
import com.ayush.bookmyshow.models.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    private String amount;
    private Date paymentTime;
    @OneToOne
    private Ticket ticket;
}
