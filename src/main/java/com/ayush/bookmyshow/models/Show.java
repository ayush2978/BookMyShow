package com.ayush.bookmyshow.models;

import com.ayush.bookmyshow.models.enums.SeatStatus;
import com.ayush.bookmyshow.models.enums.ShowStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    @OneToOne
    private Movie movie;

    @OneToOne
    private Auditorium auditorium;
    private Date startTime;
    private Date endTime;

    @Enumerated(EnumType.ORDINAL)
    private ShowStatus showStatus;
}
