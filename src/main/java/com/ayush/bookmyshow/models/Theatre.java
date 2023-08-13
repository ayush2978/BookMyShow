package com.ayush.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel{
    private String theatreName;
    private String address;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "theatre")
    private List<Auditorium> auditoriums;
}
